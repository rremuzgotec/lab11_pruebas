package com.tecsup.petclinic.entities;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "owner")
@Data
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // Change from Integer to Long
    private String first_name;
    private String last_name;
    private String address;
    private String city;
    private String telephone;

    public Owner() {

    }

    public Owner(Long id, String first_name, String last_name, String address, String city, String telephone){
        super();
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.city = city;
        this.telephone = telephone;
    }

    public Owner(String first_name, String last_name, String address, String city, String telephone){
        super();
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.city = city;
        this.telephone = telephone;
    }
}
