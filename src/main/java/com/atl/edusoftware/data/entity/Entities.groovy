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
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.OneToMany
import javax.persistence.SequenceGenerator
import javax.persistence.Table
import javax.print.DocFlavor
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern


@Entity
class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @SequenceGenerator(name = "user_Sequence", sequenceName = "USER_SEQ")
    @Column(name = "id")
    Long id

    @Column(name = "email")
    @Email(message = "Provide a valid Email address")
    @NotEmpty(message = "Please provide an email")
    String email

    @Column(name = "password")
    @Pattern(regexp = "^(?=.*[A-Z])(?=.*[!@#\$&*])(?=.*[0-9]).{8,16}\$",
            message = "Provide a Strong Password between 8-16 characters(Including a capital letter, a number and a special character)")
    @NotEmpty(message = "Provide a password")
    String password

    @Column(name = "first_name")
    @Length(min = 3, max = 10, message = "Provide a name between 3-10 characters")
    @NotEmpty(message = "Please provide your first name")
    String firstName;

    @Column(name = "last_name")
    @Length(min = 3, max = 10, message = "Provide a last name between 3-10 characters")
    @NotEmpty(message = "Please provide your last name")
    String lastName;

    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    Role role = Role.STUDENT;
}

enum Role {
    STUDENT, PROFESSOR
}