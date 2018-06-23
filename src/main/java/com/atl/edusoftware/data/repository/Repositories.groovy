package com.atl.edusoftware.data.repository

import com.atl.edusoftware.data.entity.Answer
import com.atl.edusoftware.data.entity.Question
import com.atl.edusoftware.data.entity.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
 interface QuestionRepository extends CrudRepository<Question,Long>{
    List<Question> findByChapterId(int chapterId)
}

@Repository
 interface AnswerRepository extends CrudRepository<Answer,Long>{
    Answer findByQuestionId(Long id)
}

@Repository
 interface UserRepository extends CrudRepository<User,Long>{
    User findByEmail(email)
}

