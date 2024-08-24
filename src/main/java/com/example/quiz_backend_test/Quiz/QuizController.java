package com.example.quiz_backend_test.Quiz;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class QuizController {

    private final QuizService quizService;

    @PostMapping("save")
    public void save(@RequestBody Quiz quiz){
        quizService.save(quiz);
    }

    @GetMapping("quiz")
    public List<Quiz> findAll(){
        return quizService.findAll();
    }
}
