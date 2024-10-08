package dev.vanderloureiro.springboot_deploy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ExemploController.class)
public class ExemploControllerTest {

    @MockBean
    private ExemploController controller;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldGetMessage() throws Exception {
        mockMvc.perform(get("/exemplo")).andExpect(status().is5xxServerError());
    }
}
