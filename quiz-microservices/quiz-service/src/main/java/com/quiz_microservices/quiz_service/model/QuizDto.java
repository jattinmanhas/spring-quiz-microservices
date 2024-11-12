package com.quiz_microservices.quiz_service.model;


public class QuizDto {
    String categoryName;
    Integer numQuestions;
    String title;

    public QuizDto(){
    }

    public QuizDto(String categoryName, Integer numQuestions, String title) {
        this.categoryName = categoryName;
        this.numQuestions = numQuestions;
        this.title = title;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getNumQuestions() {
        return numQuestions;
    }

    public void setNumQuestions(Integer numQuestions) {
        this.numQuestions = numQuestions;
    }

    @Override
    public String toString() {
        return "QuizDto{" +
                "categoryName='" + categoryName + '\'' +
                ", numQuestions=" + numQuestions +
                ", title='" + title + '\'' +
                '}';
    }
}