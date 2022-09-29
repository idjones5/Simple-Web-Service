package com.company.Summative1JonesImani.controllers;

import com.company.Summative1JonesImani.models.Answer;
import com.company.Summative1JonesImani.models.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MagicServiceController {

    private List<String> responseList; // storing the magic responses
    private static int idCounter = 1; // static variable to keep track of the responses

    public MagicServiceController() {
        responseList = new ArrayList<>();

        responseList.add("It is certain.");
        responseList.add("It is decidedly so.");
        responseList.add("Without a doubt.");
        responseList.add("Yes definitely.");
        responseList.add("You may rely on it.");
        responseList.add("As I see it, yes.");
        responseList.add("Most likely.");
        responseList.add("Outlook good.");
        responseList.add("Yes.");
        responseList.add("Signs point to yes.");
        responseList.add("Reply hazy, try again.");
        responseList.add("Ask again later.");
        responseList.add("Better not tell you now.");
        responseList.add("Cannot predict now.");
        responseList.add("Concentrate and ask again.");
        responseList.add("Don't count on it.");
        responseList.add("My reply is no.");
        responseList.add("My sources say no.");
        responseList.add("Outlook not so good.");
        responseList.add("Very doubtful.");

    }

    // methods
    /* method should return a random response from the responseList regardless of whether request body is empty or not */
    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public Answer magicResponse(@RequestBody(required = false) String question) {

        Answer answer = new Answer(); // answer object to store response
        int responseListSize = responseList.size() - 1;
        int randomResponseIndex = (int) (Math.random() * responseListSize); // random generated index position

        String randomResponse = responseList.get(randomResponseIndex); // response from responseList

        answer.setQuestion(question);
        answer.setId(idCounter++);
        answer.setAnswer(randomResponse);

        return answer;
    }

}