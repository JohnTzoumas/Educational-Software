package com.atl.edusoftware.data.repository

import com.atl.edusoftware.data.model.Answer
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository("answerRepository")
interface AnswerRepository extends CrudRepository<Answer, Long> {
    Answer findByQuestionId(Long id)
}