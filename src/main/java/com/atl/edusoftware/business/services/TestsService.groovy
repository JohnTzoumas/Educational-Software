package com.atl.edusoftware.business.services

import com.atl.edusoftware.data.model.Question
import com.atl.edusoftware.data.repository.QuestionRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

import javax.servlet.http.HttpServletRequest
import java.text.DecimalFormat

@Service
class TestsService {

    @Autowired
    private QuestionRepository questionRepository

    Iterable<Question> findAll() {
        return questionRepository.findAll()
    }

    List<Question> getQuizByChapterId(int chapterId) {
        return questionRepository.findFirst3ByChapterId(chapterId)
    }

    List<Question> getQuestionsInRandomOrder() {
        return questionRepository.findQuestionsInRandomOrder()
    }

    Double getResults(HttpServletRequest request) {
        def count = 0
        def total = 0
        DecimalFormat decimalFormat = new DecimalFormat("####0.00")
        request.getParameterMap().each { k ->
            if (k.value[0] == "true") {
                count++
            }
            total++
        }
        return decimalFormat.format(count * 100 / total) as double
    }

}
