package com.atl.edusoftware.business

import com.atl.edusoftware.data.entity.Question
import com.atl.edusoftware.data.repository.QuestionRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TestService {

    @Autowired
    private QuestionRepository questionRepository


    List<Question> getQuestionByChapter(){
        def chapter = 1

        questionRepository.findByChapter(chapter)


    }

}