package com.example.unitconversionapi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * The type Unit conversion api application tests.
 */
@SpringBootTest
@AutoConfigureMockMvc
class UnitConversionApiApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    /**
     * Context loads.
     */
    @Test
    void contextLoads() {
    }

    /**
     * No body should return bad request.
     *
     * @throws Exception the exception
     */
    @Test
    public void noBodyShouldReturnBadRequest() throws Exception {
        this.mockMvc.perform(post("/api/convert")).andExpect(status().isBadRequest());
    }

    /**
     * Send post request with body expect 200.
     *
     * @throws Exception the exception
     */
    @Test
    public void sendPostRequestWithBody_expect200() throws Exception {
        this.mockMvc.perform(post("/api/convert")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"conversionUnits\": \"kgToG\", \"inputValue\": 10}"))
                .andExpect(status().isOk());
    }

    /**
     * Send post request expect correct output value.
     *
     * @throws Exception the exception
     */
    @Test
    public void sendPostRequest_expectCorrectOutputValue() throws Exception {
        this.mockMvc.perform(post("/api/convert")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"conversionUnits\": \"kgToG\", \"inputValue\": 10}"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content()
                        .json("{\"inputValue\": 10.0, \"conversionUnits\": \"kgToG\", \"result\": 10000.0}"));
    }

}
