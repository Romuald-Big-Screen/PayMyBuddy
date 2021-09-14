package com.PayMyBuddy.demo.model;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "User")
public class User {

    @Id 

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USER_SEQ")
@SequenceGenerator(name = "USER_SEQ", sequenceName = "USER_SEQ")
    private Integer id;
    private String firstName;
    private String lastName;
@Column(unique = true)
private String email;
private String password;
@ManyToMany
private List<Connection> connections;
    public User(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
/*

    @Column(unique = true)
    private String email;
    private String password;*/
   /* @ManyToMany
    private List<connection> connections;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Account account; */




}
