package com.atl.edusoftware.data.entity;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="person")
public class User {

    /**
     * Creating the User entity and using Hibernate validator
     */

    //TODO make gender and role enums.

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "email")
    @Email(message = "Please provide a valid Email address")
    @NotEmpty(message = "Please provide an email")
    private String email;

    @Column(name = "password")
    @Length(min=3, message = "Password must be at least 3 characters")
    @NotEmpty(message = "Please provide a password")
    private String password;

    @Column(name = "name")
    @Length(min=2, message = "Name must be at least 2 characters")
    @NotEmpty(message = "Please provide a name")
    private String name;

    @Column(name = "surname")
    @Length(min=2, message = "Surname must be at least 2 characters")
    @NotEmpty(message = "Please provide a Surname")
    private String surname;

    @Column(name = "age")
    @Min(value = 10,message = "Must be above 10 to register")
    @Max(value = 99,message = "Must be below 99 to register")
    @NotNull(message = "Please provide an age")
    private int age;

    @Column(name = "gender")
    @NotEmpty(message = "Please provide a gender")
    private String gender;

    @Column(name = "role")
    @NotEmpty(message = "Please provide a role")
    private String role;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}


