package com.example.uberreviewservice.models;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@Entity()
@Table(name = "bookingReview")

public class Review {
    @Id //this annotation makes the id property a primary key of our table
   @GeneratedValue(strategy = GenerationType.IDENTITY)// identity means auto_increment
    Long id;
    @Column(nullable = false)
    String content;

    @Column
    Double rating;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)// this annotations tells spring about the formats of date object to be stored i.e. Date/ Time ? TimeStamp
   @CreatedDate         // this annotations tells spring that only handle it for object creation
    Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
     @LastModifiedDate  //this annotations tells that only handles it for object update
    Date updatedAt;

}

// new Review(content, rating)
