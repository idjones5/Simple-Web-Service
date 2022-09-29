package com.company.Summative1JonesImani.controllers;

import com.company.Summative1JonesImani.models.Answer;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.springframework.http.MediaType.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(MagicServiceController.class)
public class MagicServiceControllerTest {
    @Autowired // Wiring in the MockMvc object
    private MockMvc mockMvc;

    // ObjectMapper used to convert Java objects to JSON and vice versa
    private ObjectMapper mapper = new ObjectMapper();

    // A list of records for testing purposes
    private List<String> responses;
    private int randomIndex;

    @Before
    public void setUp() { }


    // testing POST /magic where request body is not null
    @Test
    public void shouldReturnAnswerObjectOnPostRequest() throws Exception {

        String inputQuestion = "is this test going to work?"; // question that will be used as the input

        // output Answer object
        Answer outputAnswer = new Answer();
        outputAnswer.setQuestion(inputQuestion);
        outputAnswer.setId(1);

        String outputJson = mapper.writeValueAsString(outputAnswer);


        mockMvc.perform(
                        post("/magic")              // perform the POST request
                                .content(inputQuestion)
                                .contentType(APPLICATION_JSON)
                )
                .andDo(print())                          // print results to console
                .andExpect(status().isOk());            // the status is ok
    }

    // testing POST /magic where request body is null
    @Test
    public void shouldReturnAnswerResponseObjectWithEmptyRequestBody() throws Exception {

        // output Answer object
        Answer outputAnswer = new Answer();
        outputAnswer.setQuestion(null); // null due to no input question being entered
        outputAnswer.setId(1);

        String outputJson = mapper.writeValueAsString(outputAnswer);


        mockMvc.perform(post("/magic"))           // perform the POST request
                .andDo(print())                          // print results to console
                .andExpect(status().isOk());
    }

}