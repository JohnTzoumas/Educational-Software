package com.atl.edusoftware.data.entity;


import javax.persistence.*;

@Entity
@Table(name="USER")
public class User {

    //TODO HIBERNATE VALIDATOR FOR REGISTER

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ST_ID")
    private int id;

    @Column(name = "ST_EMAIL")
    private String email;

    @Column(name = "ST_PASSWORD")
    private String password;

    @Column(name = "ST_NAME")
    private String name;

    @Column(name = "ST_SURNAME")
    private String surname;


    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

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
}
