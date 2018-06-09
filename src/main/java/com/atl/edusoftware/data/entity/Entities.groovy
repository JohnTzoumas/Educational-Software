package com.atl.edusoftware.data.entity

import org.hibernate.annotations.ColumnDefault
import org.hibernate.validator.constraints.Email
import org.hibernate.validator.constraints.NotEmpty

import javax.persistence.CascadeType
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.OneToMany
import javax.persistence.Table
import javax.validation.constraints.NotNull


@Entity
@Table(name = "answers")
class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long answerId

    @NotNull
    String answerText

    @NotNull
    boolean isCorrect


    @ManyToOne(targetEntity = Question.class)
    @JoinColumn(name = "question_id")
    long questionId

}

@Entity
@Table(name = "questions")
class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long questionId

    @NotNull
    String questionText

    @NotNull
    int chapter

    @OneToMany(cascade = CascadeType.ALL,
            orphanRemoval = true)
    List<Answer> answerList = new ArrayList<>()

}

@Entity
@Table(name = "users")
class User {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id

    @Email(message = "Please provide a valid Email address")
    @NotEmpty(message = "Please provide an email")
    String email

}