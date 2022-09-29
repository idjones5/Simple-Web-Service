package com.company.Summative1JonesImani.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@WebMvcTest(WordServiceController.class)
public class DefinitionServiceControllerTest {

    @Autowired
    private MockMvc mockMvc;

    // testing GET /word
    @Test
    public void shouldReturnAWordObjectOnGetRequest() throws Exception {
        mockMvc.perform(get("/word")) // performing the GET request
                .andDo(print())
                .andExpect(status().isOk());
    }


}