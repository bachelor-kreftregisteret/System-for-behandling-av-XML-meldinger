package com.Kreftregisteret.KreftregisteretApp.controllers;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;

@SpringBootTest
@AutoConfigureMockMvc
public class MeldingControllerTests {
    String GET_MELDING_ENDPOINT = "/api/v1/meldinger";

    @Autowired
    private MeldingController controller;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void contextLoads() {
        assertThat(controller).isNotNull();
    }

    @Test
    public void getMeldingTest() throws Exception {
        this.mockMvc
                .perform(get(GET_MELDING_ENDPOINT))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("meldingsinformasjon")));
    }

    @Test
    public void test() {
        System.out.println(System.getProperty("user.dir")); // System-for-behandling-av-XML-meldinger\kreftregisteret-backend
        File file = new File("Prostatapakke/Prostata_4_0_UtredningEksempelfil.xml");
    }
}
