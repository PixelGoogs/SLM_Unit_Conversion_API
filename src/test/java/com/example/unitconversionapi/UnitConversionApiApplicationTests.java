package com.example.unitconversionapi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class UnitConversionApiApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void contextLoads() {
    }

    @Test
    public void noBodyShouldReturnBadRequest() throws Exception {
        this.mockMvc.perform(post("/api/convert")).andExpect(status().isBadRequest());
    }

    @Test
    public void sendPostRequestWithBody_expect200() throws Exception {
        this.mockMvc.perform(post("/api/convert")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"conversionUnits\": \"kgToG\", \"inputValue\": 10}"))
                .andExpect(status().isOk());
    }

}
