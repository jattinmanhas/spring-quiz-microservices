package com.quiz.spring_quiz.dao;

import com.quiz.spring_quiz.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz, Integer> {
}
