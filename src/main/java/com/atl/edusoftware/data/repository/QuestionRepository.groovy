package com.atl.edusoftware.data.repository

import com.atl.edusoftware.data.model.Question
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository("questionRepository")
interface QuestionRepository extends CrudRepository<Question, Long> {
    List<Question> findByChapterId(int chapterId)
}