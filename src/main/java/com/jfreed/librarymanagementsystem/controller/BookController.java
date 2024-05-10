package com.jfreed.librarymanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.jfreed.librarymanagementsystem.entity.Book;
import com.jfreed.librarymanagementsystem.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class BookController {
    
    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public String allBooks(Model model) {
        List<Book> books = bookService.findAll();
        model.addAttribute("books", books);
        return "books/index";
    }
    
}
