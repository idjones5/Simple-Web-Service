package com.company.Summative1JonesImani.models;

public class Answer {

    private String question;
    private String answer;
    private int id;

    public Answer() { }

    public Answer(String question, int id) {
        this.question = question;
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
