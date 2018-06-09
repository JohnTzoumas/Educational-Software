package com.atl.edusoftware.data.repository

import com.atl.edusoftware.data.entity.Answer
import com.atl.edusoftware.data.entity.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import com.atl.edusoftware.data.entity.Question

@Repository
interface QuestionRepository extends CrudRepository<Question,Long>{
    List<Question> findByChapter(chapter)
}

//@Repository
//interface AnswerRepository extends CrudRepository<Answer,String>{
//    List<Answer> findByQuestionId(int questionId)
//}

@Repository
interface UserRepository extends CrudRepository<User,Long>{
    User findByEmail(email)

}

