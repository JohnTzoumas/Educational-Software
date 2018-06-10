package com.atl.edusoftware.data.entity

import com.fasterxml.jackson.annotation.JsonBackReference
import com.fasterxml.jackson.annotation.JsonManagedReference
import org.hibernate.annotations.ColumnDefault
import org.hibernate.validator.constraints.Email
import org.hibernate.validator.constraints.Length
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
import javax.persistence.SequenceGenerator
import javax.persistence.Table
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern


@Entity
class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long Id

    @Column(name = "answer_text")
    String answerText

    @Column(name = "is_correct")
    Boolean isCorrect


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question_id", nullable = false)
    @JsonBackReference
    Question questionId

}

@Entity
class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "question_Sequence", sequenceName = "QUESTION_SEQ")
    Long Id

    @Column(name = "question_text")
    String questionText

    @Column(name = "chapter_id")
    int chapterId

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "questionId")
    @JsonManagedReference
    List<Answer> answers

}

@Entity
@Table(name = "users")
class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    Long id

    @Column(name = "email")
    @Email(message = "Please provide a valid Email address")
    @NotEmpty(message = "Please provide an email")
    String email

    @Column(name = "password")
//    @Pattern(regexp="[]",
//            message="{invalid.email}")
    @Length(min = 3, message = "Password must be at least 3 characters")
    @NotEmpty(message = "Please provide a password")
    String password

    @Column(name = "name")
    @Length(min = 2, message = "Name must be at least 2 characters")
    @NotEmpty(message = "Please provide a name")
    String name;

    @Column(name = "surname")
    @Length(min = 2, message = "Surname must be at least 2 characters")
    @NotEmpty(message = "Please provide a Surname")
    String surname;


}