package com.example.uberreviewservice.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import java.util.Date;


@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public abstract class BaseModel {
    @Id //this annotation makes the id property a primary key of our table
    @GeneratedValue(strategy = GenerationType.IDENTITY)// identity means auto_increment
    protected Long id;


    @Temporal(TemporalType.TIMESTAMP)// this annotation tells spring about the formats of date object to be stored i.e. Date/ Time ? TimeStamp
    @CreatedDate         // this annotation tells spring that only handle it for object creation
    protected Date createdAt;


    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate  //this annotation tells that only handles it for object update
    protected Date updatedAt;
}
