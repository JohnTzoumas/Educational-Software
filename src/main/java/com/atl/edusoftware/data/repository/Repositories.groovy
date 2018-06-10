package com.atl.edusoftware.data.repository

import com.atl.edusoftware.data.entity.Answer
import com.atl.edusoftware.data.entity.User
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import com.atl.edusoftware.data.entity.Question

@Repository
 interface QuestionRepository extends CrudRepository<Question,Long>{
    Question findByChapterId(int chapterId)
}

@Repository
 interface AnswerRepository extends CrudRepository<Answer,Long>{
    Answer findByQuestionId(Long id)
}

@Repository
 interface UserRepository extends CrudRepository<User,Long>{
    User findByEmail(email)
}

