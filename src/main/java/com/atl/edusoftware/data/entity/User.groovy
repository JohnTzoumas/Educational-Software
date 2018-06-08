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
    def id

    @Column(name = "email")
    @Email(message = "Please provide a valid Email address")
    @NotEmpty(message = "Please provide an email")
    def email

    @Column(name = "password")
    @Length(min = 3, message = "Password must be at least 3 characters")
    @NotEmpty(message = "Please provide a password")
    def password

    @Column(name = "name")
    @Length(min = 2, message = "Name must be at least 2 characters")
    @NotEmpty(message = "Please provide a name")
    def name

    @Column(name = "surname")
    @Length(min = 2, message = "Surname must be at least 2 characters")
    @NotEmpty(message = "Please provide a Surname")
    def surname

    @Column(name = "age")
    @NotNull(message = "Please provide an age")
    def age

    @Column(name = "role")
    @NotEmpty(message = "Please provide a role")
    def role

}


