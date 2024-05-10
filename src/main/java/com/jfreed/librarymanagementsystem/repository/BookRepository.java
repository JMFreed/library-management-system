package com.jfreed.librarymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jfreed.librarymanagementsystem.entity.Book;

public interface BookRepository extends JpaRepository<Book, String> {
    
    Book findByIsbn(String isbn);
}
