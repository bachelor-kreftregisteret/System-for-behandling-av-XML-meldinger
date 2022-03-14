package com.Kreftregisteret.KreftregisteretApp.controllers;

import java.io.File;
import java.util.Arrays;
import com.Kreftregisteret.KreftregisteretApp.utils.Utmappe;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MvcResult;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class MeldingControllerTests {
    final String GET_ALL_MELDINGER_ENDPOINT = "/api/v1/meldinger";
    final String POST_MELDING_ENDPOINT = "/api/v1/meldinger";

    @Autowired
    private MeldingController controller;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void contextLoads() {
        assertThat(controller).isNotNull();
    }

    // TODO: getMeldingTest()

    @Test
    @DisplayName("Test: getAllMeldingerTest()")
    public void getAllMeldingerTest() throws Exception {
        // Check status is OK and return mvcResult
        MvcResult mvcResult =
                this.mockMvc
                        .perform(get(GET_ALL_MELDINGER_ENDPOINT))
                        .andDo(print())
                        .andExpect(status().isOk())
                        .andReturn();

        // Convert mvcResult response to string
        String resultAsString = mvcResult.getResponse().getContentAsString();

        // Get all filenames in utmappe
        File[] files = Utmappe.listFiles();
        String[] filenames = Arrays
                .stream(files)
                .map(File::getName)
                .toArray(String[]::new);

        // Check if getAllMeldinger() returns all filenames in utmappe
        for (String filename : filenames) {
            assertTrue(resultAsString.contains(filename), filename + " should be in " + resultAsString);
        }
    }

    @Test
    @DisplayName("Test: postValidMeldingTest()")
    public void postValidMeldingTest() throws Exception {
        // TODO: Validering
        final String VALID_POST_JSON = "{\"@type\":\"KliniskProstataUtredning\",\"meldingsinformasjon\":{\"skjema\":\"KliniskProstataUtredning\",\"versjonsNr\":\"4.0\",\"versjonsNrOriginal\":\"String\",\"krgguid\":\"\",\"versjonIP\":0,\"versjonBT\":0,\"tidspunktSubmit\":\"2001-12-17T09:30:47Z\",\"brukernavn\":\"\",\"filnavn\":\"06032022_kl181735KliniskProstataUtredning.xml\",\"versjonInternEkstern\":\"1\",\"feilSkjema\":true},\"navigering\":{\"meldingstittel\":\"\",\"meldingsNr\":\"\"},\"stdInfo\":{\"pasientInstitusjon\":{\"fodselsnummerKRG\":\"\",\"fodselsnummerHF\":\"\",\"fodselnummerUtland\":true,\"fodselsnummerUtlandSpesifiser\":\"String\",\"navnPasient\":\"Eksempelnavn Navnesen\",\"sykehuskode\":\"\",\"sykehusnavnRHF\":\"1\",\"sykehusnavnHFSorOst\":\"0402\",\"sykehusnavnHFVest\":\"\",\"sykehusnavnHFMidt\":\"\",\"sykehusnavnHFNord\":\"\",\"sykehusnavnSpesSenter\":\"\",\"sykehusnavnHFSpesifiser\":\"\",\"sykehusnavnKRGSpesifiser\":\"\",\"avdelingskode\":\"\",\"avdelingsnavn\":\"2\",\"avdelingsnavnHFSpesifiser\":\"\",\"avdelingsnavnKRGSpesifiser\":\"\"},\"oppfolging\":{\"oppfolgingBehandling\":{\"videreTiltakUtredning\":\"7\",\"videreTiltakUtredningSpesifiser\":\"3\",\"videreTiltakUtredningSpesifiser2\":\"String\",\"videreTiltakUtredningDato\":\"1957-08-13\"}},\"kommentarfelt\":{\"kommentar\":\"\"},\"filmBilde\":{\"filmNr\":\"\",\"bildeNr\":\"\"},\"melder\":{\"meldersNavn\":\"serdtfy\",\"meldeDato\":\"1957-08-13\",\"melderID\":\"\"}},\"laboratorium\":{\"labnavnKRG\":\"\",\"labnavnHF\":\"07\",\"labnavnHFIkkeRelevant\":true,\"labnavnHFSpesifiser\":\"\",\"preparatnummer\":\"\",\"labkode\":\"\"},\"infiltrerendeKreft\":{\"kreft\":\"1\"},\"utredning\":{\"funnUtredning\":\"1\",\"diagnosedato\":\"1957-08-13\",\"sykehistorie\":{\"vannlatingsproblem\":\"0\",\"kreftsymptomer\":\"99\",\"prostatavolum\":\"\",\"prostatavolumUkjent\":\"99\",\"spsa\":{\"psaverdiIkkeTatt\":true,\"psaverdi\":\"\",\"psaverdiUkjent\":\"\"},\"whostatus\":\"5\"},\"diagnostiskeUS\":{\"bildediagnostikkUS\":{\"datoMRDiagnostikk\":\"1957-08-13\",\"datoMRDiagnostikkUkjent\":\"\",\"annetBildediagnostikk\":\"0\",\"annetBildediagnostikkSpesifiser2\":\"\",\"mrdiagnostikk\":\"1\"},\"vevsprover\":\"1\",\"vevsproverUS\":{\"biopsiVevsprover\":true,\"annetVevsprover\":true,\"annetVevsproverSpesifiser2\":\"\",\"turpvevsprover\":true}},\"datoMetastaser\":\"\",\"sykdomsutbredelse\":{\"tumor\":{\"palpatoriskTumorHoyre\":\"5\",\"palpatoriskTumorVenstre\":\"5\",\"samletPalpatoriskTumor\":\"T4\",\"samletMRBasertKliniskT\":\"\",\"totalVurderingKliniskT\":\"4\",\"kliniskVurdertAv\":\"2\",\"mrbasertKliniskTVenstre\":\"4\",\"mrbasertKliniskTHoyre\":\"4\",\"piradshoyre\":\"4\",\"piradsvenstre\":\"4\"},\"regionaleLK\":{\"regionaleLKPaavist\":\"1\"},\"fjernmetastaser\":{\"fjernmetPaavist\":\"1\",\"lokalisasjonFjernmet\":{\"fjerneLKmet\":true,\"skjelettmet\":true,\"annetFjernmet\":true,\"annetFjernmetSpesifiser\":\"\"}},\"utredningsmetodeMetastaser\":{\"utredningsmetodeLK\":\"5\",\"annenDiagnostikkLKSpesifiser\":\"\",\"utredningsmetodeFjernmet\":{\"skjelettscintigrafiMet\":true,\"rtgThoraxMet\":true,\"rtgBekkenMet\":true,\"cytologiMet\":true,\"biopsiMet\":true,\"annenDiagnostikkMet\":true,\"annenDiagnostikkMetSpesifiser\":\"\",\"utredningsmetodeFjernmetUkjent\":\"\",\"mrmet\":true,\"petmet\":true,\"ctmet\":true}}},\"kliniskTNM\":{\"ct\":\"4\",\"cn\":\"\",\"cm\":\"\"}},\"skjemaNavn\":\"KliniskProstataUtredning\",\"filnavn\":\"06032022_kl181735KliniskProstataUtredning.xml\",\"metaData\":\"2001-12-17T09:30:47Z4.0\"}";
        this.mockMvc
                .perform(post(POST_MELDING_ENDPOINT)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(VALID_POST_JSON))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    @DisplayName("Test: postInvalidMeldingTest()")
    public void postInvalidMelding() throws Exception {
        final String INVALID_POST_JSON = "{\"@type\":\"KliniskProstataUtredning\",\"meldingsinformasjon\":{\"skjema\":\"KliniskProstataUtredning\",\"versjonsNr\":\"4.0\",\"versjonsNrOriginal\":\"String\",\"krgguid\":\"\",\"versjonIP\":0,\"versjonBT\":0,\"tidspunktSubmit\":\"2001-12-17T09:30:47Z\",\"brukernavn\":\"\",\"filnavn\":\"06032022_kl181735KliniskProstataUtredning.xml\",\"versjonInternEkstern\":\"1\",\"feilSkjema\":true},\"navigering\":{\"meldingstittel\":\"\",\"meldingsNr\":\"\"},\"stdInfo\":{\"pasientInstitusjon\":{\"fodselsnummerKRG\":\"\",\"fodselsnummerHF\":\"\",\"fodselnummerUtland\":true,\"fodselsnummerUtlandSpesifiser\":\"String\",\"navnPasient\":\"Eksempelnavn Navnesen\",\"sykehuskode\":\"\",\"sykehusnavnRHF\":\"1\",\"sykehusnavnHFSorOst\":\"0402\",\"sykehusnavnHFVest\":\"\",\"sykehusnavnHFMidt\":\"\",\"sykehusnavnHFNord\":\"\",\"sykehusnavnSpesSenter\":\"\",\"sykehusnavnHFSpesifiser\":\"\",\"sykehusnavnKRGSpesifiser\":\"\",\"avdelingskode\":\"\",\"avdelingsnavn\":\"2\",\"avdelingsnavnHFSpesifiser\":\"\",\"avdelingsnavnKRGSpesifiser\":\"\"},\"oppfolging\":{\"oppfolgingBehandling\":{\"videreTiltakUtredning\":\"7\",\"videreTiltakUtredningSpesifiser\":\"3\",\"videreTiltakUtredningSpesifiser2\":\"String\",\"videreTiltakUtredningDato\":\"1957-08-13\"}},\"kommentarfelt\":{\"kommentar\":\"\"},\"filmBilde\":{\"filmNr\":\"\",\"bildeNr\":\"\"},\"melder\":{\"meldersNavn\":\"serdtfy\",\"meldeDato\":\"1957-08-13\",\"melderID\":\"\"}},\"laboratorium\":{\"labnavnKRG\":\"\",\"labnavnHF\":\"07\",\"labnavnHFIkkeRelevant\":true,\"labnavnHFSpesifiser\":\"\",\"preparatnummer\":\"\",\"labkode\":\"\"},\"infiltrerendeKreft\":{\"kreft\":\"1\"},\"utredning\":{\"funnUtredning\":\"1\",\"diagnosedato\":\"1957-08-13\",\"sykehistorie\":{\"vannlatingsproblem\":\"0\",\"kreftsymptomer\":\"99\",\"prostatavolum\":\"\",\"prostatavolumUkjent\":\"99\",\"spsa\":{\"psaverdiIkkeTatt\":true,\"psaverdi\":\"\",\"psaverdiUkjent\":\"\"},\"whostatus\":\"5\"},\"diagnostiskeUS\":{\"bildediagnostikkUS\":{\"datoMRDiagnostikk\":\"1957-08-13\",\"datoMRDiagnostikkUkjent\":\"\",\"annetBildediagnostikk\":\"0\",\"annetBildediagnostikkSpesifiser2\":\"\",\"mrdiagnostikk\":\"1\"},\"vevsprover\":\"1\",\"vevsproverUS\":{\"biopsiVevsprover\":true,\"annetVevsprover\":true,\"annetVevsproverSpesifiser2\":\"\",\"turpvevsprover\":true}},\"datoMetastaser\":\"\",\"sykdomsutbredelse\":{\"tumor\":{\"palpatoriskTumorHoyre\":\"5\",\"palpatoriskTumorVenstre\":\"5\",\"samletPalpatoriskTumor\":\"T4\",\"samletMRBasertKliniskT\":\"\",\"totalVurderingKliniskT\":\"8\",\"kliniskVurdertAv\":\"2\",\"mrbasertKliniskTVenstre\":\"4\",\"mrbasertKliniskTHoyre\":\"4\",\"piradshoyre\":\"4\",\"piradsvenstre\":\"4\"},\"regionaleLK\":{\"regionaleLKPaavist\":\"1\"},\"fjernmetastaser\":{\"fjernmetPaavist\":\"1\",\"lokalisasjonFjernmet\":{\"fjerneLKmet\":true,\"skjelettmet\":true,\"annetFjernmet\":true,\"annetFjernmetSpesifiser\":\"\"}},\"utredningsmetodeMetastaser\":{\"utredningsmetodeLK\":\"5\",\"annenDiagnostikkLKSpesifiser\":\"\",\"utredningsmetodeFjernmet\":{\"skjelettscintigrafiMet\":true,\"rtgThoraxMet\":true,\"rtgBekkenMet\":true,\"cytologiMet\":true,\"biopsiMet\":true,\"annenDiagnostikkMet\":true,\"annenDiagnostikkMetSpesifiser\":\"\",\"utredningsmetodeFjernmetUkjent\":\"\",\"mrmet\":true,\"petmet\":true,\"ctmet\":true}}},\"kliniskTNM\":{\"ct\":\"4\",\"cn\":\"\",\"cm\":\"\"}},\"skjemaNavn\":\"KliniskProstataUtredning\",\"filnavn\":\"06032022_kl181735KliniskProstataUtredning.xml\",\"metaData\":\"2001-12-17T09:30:47Z4.0\"}";
        this.mockMvc
                .perform(post(POST_MELDING_ENDPOINT)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(INVALID_POST_JSON))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }
}
