package com.atl.edusoftware.data.model

import javax.persistence.*

@Entity
@Table(name = "role")
class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    int id
    @Column(name = "role")
    String role = "STUDENT"

}
