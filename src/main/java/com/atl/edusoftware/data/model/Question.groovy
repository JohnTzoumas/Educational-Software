package com.atl.edusoftware.data.model

import com.fasterxml.jackson.annotation.JsonManagedReference

import javax.persistence.*

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