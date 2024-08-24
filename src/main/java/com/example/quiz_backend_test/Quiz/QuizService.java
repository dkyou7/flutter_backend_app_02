package com.example.quiz_backend_test.Quiz;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class QuizService {
    private final QuizRepository quizRepository;

    public void save(Quiz quiz){
        quizRepository.save(quiz);
    }

    public List<Quiz> findAll(){
        List<Quiz> all = quizRepository.findAll();
        for(Quiz quiz : all){
            System.out.println(quiz);
        }
        return all;
    }
}
