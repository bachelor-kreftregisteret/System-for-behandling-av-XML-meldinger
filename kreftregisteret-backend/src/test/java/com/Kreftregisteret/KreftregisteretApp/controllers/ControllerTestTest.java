package com.Kreftregisteret.KreftregisteretApp.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;



@WebMvcTest(ControllerTest.class)
class ControllerTestTest {

    @Autowired
    private MockMvc mvc;
    @Test
    void helloWorld() {
    }

    @Test
    void helloWorldDTO() {
    }

    @Test
    void updateMelding() {
    }
}