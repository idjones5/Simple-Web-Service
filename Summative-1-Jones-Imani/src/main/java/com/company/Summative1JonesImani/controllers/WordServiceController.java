package com.company.Summative1JonesImani.controllers;

import com.company.Summative1JonesImani.models.Definition;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WordServiceController {
    public List<Definition> definitionList; // where the Word objects are going to be stored
    public static int idCounter = 1; // static variable to keep track of the ids

    public WordServiceController() {
        definitionList = new ArrayList<>();

        definitionList.add(new Definition("grenadine", "thin syrup made from pomegranate juice; used in mixed drinks", idCounter++));
        definitionList.add(new Definition("pomegranate", "shrub or small tree having large red many-seeded fruit", idCounter++));
        definitionList.add(new Definition("hefty", "of considerable weight and size", idCounter++));
        definitionList.add(new Definition("gladiolus", "any of numerous plants of the genus Gladiolus native chiefly to tropical and South Africa having sword-shaped " +
                "leaves and one-sided spikes of brightly colored funnel-shaped flowers; widely cultivated", idCounter++));
        definitionList.add(new Definition("pelter", "a thrower of missiles", idCounter++));
        definitionList.add(new Definition("concretize", "make something concrete", idCounter++));
        definitionList.add(new Definition("manikin", "a life-size dummy used to display clothes", idCounter++));
        definitionList.add(new Definition("canvass", "question (someone) in order to ascertain their opinion.", idCounter++));
        definitionList.add(new Definition("lubberly", "clumsy and unskilled", idCounter++));
        definitionList.add(new Definition("cordial", "politely warm and friendly", idCounter++));


    }


    // methods
    /* method should return a random word and its definition */
    @RequestMapping(value = "/word", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Definition getRandomWord() {
        Definition randomDefinition = null; // creating a new Word object
        int wordListLength = definitionList.size() - 1; // Word list size
        int randomWordIndex = (int) (Math.random() * wordListLength); // generating a random index in the list

        randomDefinition = definitionList.get(randomWordIndex); // grabbing the random Word

        return randomDefinition;
    }
}
