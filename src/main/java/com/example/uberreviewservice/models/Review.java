package com.example.uberreviewservice.models;

import jakarta.persistence.*;
import lombok.*;



@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity()

@Table(name = "bookingReview")

public class Review extends BaseModel{

    @Column(nullable = false)
    String content;

    @Column
    private Double rating;



    @Override
    public String toString() {
        return "Review: " + this.content +" rating: " + this.rating + " created at: " + this.createdAt + " updated at: " + this.updatedAt;
    }

}

// new Review(content, rating)
