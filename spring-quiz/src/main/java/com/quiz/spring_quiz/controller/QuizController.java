package com.quiz.spring_quiz.controller;

import com.quiz.spring_quiz.model.Question;
import com.quiz.spring_quiz.model.QuestionWrapper;
import com.quiz.spring_quiz.model.Quiz;
import com.quiz.spring_quiz.model.Response;
import com.quiz.spring_quiz.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("quiz")
public class QuizController {
    @Autowired
    private QuizService quizService;

    @PostMapping("create")
    public ResponseEntity<String> createQuiz(@RequestParam String category, @RequestParam int numQ, @RequestParam String title){
        quizService.createQuiz(category, numQ, title);
        return new ResponseEntity<>("I am here", HttpStatus.CREATED);
    }

    @GetMapping("get/{id}")
    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(@PathVariable int id){
        return quizService.getQuizQuestions(id);
    }

    @PostMapping("submit/{id}")
    public ResponseEntity<Integer> submitQuiz(@PathVariable Integer id, @RequestBody List<Response> response){
        return quizService.calculateResult(id, response );
    }
}
