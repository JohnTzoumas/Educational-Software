package com.atl.edusoftware.business.Implementation

import com.atl.edusoftware.data.model.Question
import com.atl.edusoftware.data.repository.QuestionRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class QuizServiceImpl {

    @Autowired
    private QuestionRepository questionRepository

    Iterable<Question> findAll() {
        questionRepository.findAll()
    }

    List<Question> getQuizByChapterId(int chapterId) {
        questionRepository.findByChapterId(chapterId)
    }

}
