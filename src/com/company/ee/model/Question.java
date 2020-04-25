package com.company.ee.model;

import java.util.List;

public class Question {

    private String section;
    private String title;
    private String correctAnswer;
    private List<String> listQuestion;

    public Question(String section, String title, String correctAnswer, List<String> listQuestion) {
        this.section = section;
        this.title = title;
        this.correctAnswer = correctAnswer;
        this.listQuestion = listQuestion;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public List<String> getListQuestion() {
        return listQuestion;
    }

    public void setListQuestion(List<String> listQuestion) {
        this.listQuestion = listQuestion;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
