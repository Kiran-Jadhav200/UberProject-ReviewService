package com.example.uberreviewservice.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Review {
    @Id //this annotation makes the id property a primary key of our table
    Long id;

    @Column
    String name;

}
