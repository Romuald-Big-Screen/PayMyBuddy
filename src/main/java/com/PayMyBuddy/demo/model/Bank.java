package com.PayMyBuddy.demo.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Bank {
    @Id
    private int id;
    private String name;
    private String address;
    private String zip;
    private String City;

    public Bank() {

    }

    public Bank(int id, String name, String address, String zip, String city) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.zip = zip;
        City = city;
    }
}
