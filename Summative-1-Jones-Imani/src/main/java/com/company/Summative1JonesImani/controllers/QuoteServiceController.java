package com.company.Summative1JonesImani.controllers;

import com.company.Summative1JonesImani.models.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class QuoteServiceController {

    public List<Quote> quoteList; // where the quotes are going to be stored
    public static int idCounter = 1; // static variable to keep track of the ids

    public QuoteServiceController() {
        quoteList = new ArrayList<>(); // initializing the list as an arraylist

        quoteList.add(new Quote("Spread love everywhere you go. Let no one ever come to you without leaving happier.", "Mother Teresa", idCounter++));
        quoteList.add(new Quote("When you reach the end of your rope, tie a knot in it and hang on.", "Franklin D. Roosevelt", idCounter++));
        quoteList.add(new Quote("Always remember that you are absolutely unique. Just like everyone else.", "Margaret Mead", idCounter++));
        quoteList.add(new Quote("The greatest glory in living lies not in never falling, but in rising every time we fall.", "Nelson Mandela", idCounter++));
        quoteList.add(new Quote("The way to get started is to quit talking and begin doing.", "Walt Disney", idCounter++));
        quoteList.add(new Quote("Your time is limited, so don't waste it living someone else's life. Don't be trapped by dogma – which is living with the results of other people's thinking.", "Steve Jobs", idCounter++));
        quoteList.add(new Quote("If life were predictable it would cease to be life, and be without flavor.", "Eleanor Roosevelt", idCounter++));
        quoteList.add(new Quote("If you look at what you have in life, you'll always have more. If you look at what you don't have in life, you'll never have enough.", "Oprah Winfrey", idCounter++));
        quoteList.add(new Quote("If you set your goals ridiculously high and it's a failure, you will fail above everyone else's success.", "James Cameron", idCounter++));
        quoteList.add(new Quote("The best and most beautiful things in the world cannot be seen or even touched — they must be felt with the heart.", "Helen Keller", idCounter++));

    }


    // methods
    /* method should return a random quote and its author */
    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Quote getRandomQuote() {
        Quote randomQuote = null; // creating a new quote object
        int quoteListLength = quoteList.size() - 1; // quote list size
        int randomQuoteIndex = (int) (Math.random() * quoteListLength); // generating a random index in the list

        randomQuote = quoteList.get(randomQuoteIndex); // grabbing the random quote

        return randomQuote;
    }
}
