package com.company.Summative1JonesImani.controllers;

import com.company.Summative1JonesImani.models.Word;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WordServiceController {
    public List<Word> wordList; // where the Word objects are going to be stored
    public static int idCounter = 1; // static variable to keep track of the ids

    public WordServiceController() {
        wordList = new ArrayList<>();

        wordList.add(new Word("grenadine", "thin syrup made from pomegranate juice; used in mixed drinks", idCounter++));
        wordList.add(new Word("pomegranate", "shrub or small tree having large red many-seeded fruit", idCounter++));
        wordList.add(new Word("hefty", "of considerable weight and size", idCounter++));
        wordList.add(new Word("gladiolus", "any of numerous plants of the genus Gladiolus native chiefly to tropical and South Africa having sword-shaped " +
                "leaves and one-sided spikes of brightly colored funnel-shaped flowers; widely cultivated", idCounter++));
        wordList.add(new Word("pelter", "a thrower of missiles", idCounter++));
        wordList.add(new Word("concretize", "make something concrete", idCounter++));
        wordList.add(new Word("manikin", "a life-size dummy used to display clothes", idCounter++));
        wordList.add(new Word("canvass", "question (someone) in order to ascertain their opinion.", idCounter++));
        wordList.add(new Word("lubberly", "clumsy and unskilled", idCounter++));
        wordList.add(new Word("cordial", "politely warm and friendly", idCounter++));


    }


    // methods
    /* method should return a random word and its definition */
    @RequestMapping(value = "/word", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Word getRandomWord() {
        Word randomWord = null; // creating a new Word object
        int wordListLength = wordList.size() - 1; // Word list size
        int randomWordIndex = (int) (Math.random() * wordListLength); // generating a random index in the list

        randomWord = wordList.get(randomWordIndex); // grabbing the random Word

        return randomWord;
    }
}
