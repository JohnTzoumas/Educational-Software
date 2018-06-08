package com.atl.edusoftware.data.entity;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "users")
class User {

    /**
     * Creating the User entity.
     * Using Hibernate validator
     */

    //TODO make gender and role enums.

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    int id

    @Column(name = "email")
    @Email(message = "Please provide a valid Email address")
    @NotEmpty(message = "Please provide an email")
    String email

}


