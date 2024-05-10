package com.jfreed.librarymanagementsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "books")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    
    @Id
    private String isbn;

    private String title;

    private String author;

    private String publisher;

    private int year;
}
