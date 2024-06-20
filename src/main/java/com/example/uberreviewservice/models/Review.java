package com.example.uberreviewservice.models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity()
@EntityListeners(AuditingEntityListener.class)
@Table(name = "bookingReview")

public class Review {
    @Id //this annotation makes the id property a primary key of our table
   @GeneratedValue(strategy = GenerationType.IDENTITY)// identity means auto_increment
    private Long id;
    @Column(nullable = false)
    String content;

    @Column
    private Double rating;


    @Temporal(TemporalType.TIMESTAMP)// this annotations tells spring about the formats of date object to be stored i.e. Date/ Time ? TimeStamp
   @CreatedDate         // this annotations tells spring that only handle it for object creation
    private Date createdAt;


    @Temporal(TemporalType.TIMESTAMP)
     @LastModifiedDate  //this annotations tells that only handles it for object update
    private Date updatedAt;

    @Override
    public String toString() {
        return "Review: " + this.content +" rating: " + this.rating + " created at: " + this.createdAt + " updated at: " + this.updatedAt;
    }

}

// new Review(content, rating)
