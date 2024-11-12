package com.quiz_microservices.quiz_service.model;
import jakarta.persistence.*;

import java.util.List;

@Entity

public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String title;
    @ElementCollection
    private List<Integer> questionIds;

    public Quiz(){

    }

    public Quiz(Integer id, String title, List<Integer> questions) {
        this.id = id;
        this.title = title;
        this.questionIds = questions;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Integer> getQuestionIds() {
        return questionIds;
    }

    public void setQuestionIds(List<Integer> questions) {
        this.questionIds = questions;
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", questions=" + questionIds +
                '}';
    }
}

