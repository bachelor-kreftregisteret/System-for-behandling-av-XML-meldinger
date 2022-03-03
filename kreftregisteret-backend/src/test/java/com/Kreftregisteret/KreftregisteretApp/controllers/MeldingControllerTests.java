package com.Kreftregisteret.KreftregisteretApp.controllers;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;

@SpringBootTest
@AutoConfigureMockMvc
public class MeldingControllerTests {
    final String GET_MELDING_ENDPOINT = "/api/v1/meldinger";
    final String POST_MELDING_ENDPOINT = "/api/v1/meldinger";

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
    public void postMeldingTest() throws Exception {
        // TODO: Validering
        final String VALID_POST_JSON = "{\"type\":\"KliniskProstataUtredning\",\"meldingsinformasjon\":{\"skjema\":\"KliniskProstataUtredning\",\"versjonsNr\":\"4.0\",\"versjonsNrOriginal\":\"String\",\"krgguid\":\"\",\"versjonIP\":0,\"versjonBT\":0,\"tidspunktSubmit\":\"2001-12-17T09:30:47Z\",\"brukernavn\":\"\",\"filnavn\":\"\",\"versjonInternEkstern\":\"1\",\"feilSkjema\":true},\"navigering\":{\"meldingstittel\":\"\",\"meldingsNr\":\"\"},\"stdInfo\":{\"pasientInstitusjon\":{\"fodselsnummerKRG\":\"\",\"fodselsnummerHF\":1234567891236,\"fodselnummerUtland\":true,\"fodselsnummerUtlandSpesifiser\":\"String\",\"navnPasient\":\"asdf\",\"sykehuskode\":\"\",\"sykehusnavnRHF\":\"3\",\"sykehusnavnHFMidt\":\"1702\",\"sykehusnavnHFSpesifiser\":\"gdxcfh\",\"sykehusnavnKRGSpesifiser\":\"\",\"avdelingskode\":\"\",\"avdelingsnavn\":\"2\",\"avdelingsnavnHFSpesifiser\":\"\",\"avdelingsnavnKRGSpesifiser\":\"\"},\"oppfolging\":{\"oppfolgingBehandling\":{\"videreTiltakUtredning\":\"4\",\"videreTiltakUtredningSpesifiser\":\"3\",\"videreTiltakUtredningSpesifiser2\":\"String\"}},\"kommentarfelt\":{\"kommentar\":\"\"},\"filmBilde\":{\"filmNr\":\"\",\"bildeNr\":\"\"},\"melder\":{\"meldersNavn\":\"serdtfy\",\"meldeDato\":\"1957-08-13\",\"melderID\":\"\"}},\"laboratorium\":{\"labnavnKRG\":\"\",\"labnavnHF\":\"15\",\"labnavnHFIkkeRelevant\":true,\"labnavnHFSpesifiser\":\"\",\"preparatnummer\":\"\",\"labkode\":\"\"},\"infiltrerendeKreft\":{\"kreft\":\"1\"},\"utredning\":{\"funnUtredning\":\"2\",\"diagnosedato\":\"1957-08-13\",\"sykehistorie\":{\"vannlatingsproblem\":\"0\",\"kreftsymptomer\":\"99\",\"prostatavolum\":\"\",\"prostatavolumUkjent\":\"99\",\"spsa\":{\"psaverdiIkkeTatt\":true,\"psaverdi\":\"\",\"psaverdiUkjent\":\"99\"},\"whostatus\":\"5\"},\"diagnostiskeUS\":{\"bildediagnostikkUS\":{\"datoMRDiagnostikk\":\"1957-08-13\",\"datoMRDiagnostikkUkjent\":\"\",\"annetBildediagnostikk\":\"0\",\"annetBildediagnostikkSpesifiser2\":\"\",\"mrdiagnostikk\":\"1\"},\"vevsprover\":\"0\",\"vevsproverUS\":{\"biopsiVevsprover\":false,\"annetVevsprover\":false,\"annetVevsproverSpesifiser2\":\"\",\"turpvevsprover\":false}},\"sykdomsutbredelse\":{\"tumor\":{\"palpatoriskTumorHoyre\":\"3\",\"palpatoriskTumorVenstre\":\"2\",\"samletPalpatoriskTumor\":\"\",\"totalVurderingKliniskT\":\"1\",\"kliniskVurdertAv\":\"2\",\"piradshoyre\":\"3\",\"piradsvenstre\":\"2\"},\"regionaleLK\":{\"regionaleLKPaavist\":\"1\"},\"fjernmetastaser\":{\"fjernmetPaavist\":\"1\",\"lokalisasjonFjernmet\":{\"fjerneLKmet\":true,\"skjelettmet\":true,\"annetFjernmet\":true,\"annetFjernmetSpesifiser\":\"\"}},\"utredningsmetodeMetastaser\":{\"utredningsmetodeLK\":\"5\",\"annenDiagnostikkLKSpesifiser\":\"\",\"utredningsmetodeFjernmet\":{\"skjelettscintigrafiMet\":true,\"rtgThoraxMet\":true,\"rtgBekkenMet\":true,\"cytologiMet\":true,\"biopsiMet\":true,\"annenDiagnostikkMet\":true,\"annenDiagnostikkMetSpesifiser\":\"\",\"utredningsmetodeFjernmetUkjent\":\"\",\"mrmet\":true,\"ctmet\":true,\"petmet\":true}}},\"kliniskTNM\":{\"ct\":\"\",\"cn\":\"\",\"cm\":\"\"}},\"skjemaNavn\":\"KliniskProstataUtredning\"}";
        System.out.println(VALID_POST_JSON);
        this.mockMvc
                .perform(post(POST_MELDING_ENDPOINT)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(VALID_POST_JSON))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    public void test() {
        System.out.println(System.getProperty("user.dir")); // System-for-behandling-av-XML-meldinger\kreftregisteret-backend
        File file = new File("Prostatapakke/Prostata_4_0_UtredningEksempelfil.xml");
    }
}
