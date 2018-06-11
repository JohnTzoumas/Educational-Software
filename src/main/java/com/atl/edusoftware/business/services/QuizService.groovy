package com.atl.edusoftware.business.services

import com.atl.edusoftware.data.entity.Question
import com.atl.edusoftware.data.repository.QuestionRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class QuizService{

    @Autowired
    private QuestionRepository questionRepository

    public Iterable<Question> findAll(){
        questionRepository.findAll()
    }
}
