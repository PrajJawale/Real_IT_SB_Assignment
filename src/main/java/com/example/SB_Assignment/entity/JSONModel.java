package com.example.SB_Assignment.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "JsonModel")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class JSONModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Lob
    @Column(name = "jsonmodel", columnDefinition = "TEXT")
    String json;
}


