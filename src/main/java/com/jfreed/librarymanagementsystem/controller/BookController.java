package com.jfreed.librarymanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.jfreed.librarymanagementsystem.entity.Book;
import com.jfreed.librarymanagementsystem.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/books")
public class BookController {
    
    @Autowired
    private BookService bookService;

    @GetMapping
    public String index(Model model) {
        List<Book> books = bookService.findAll();
        model.addAttribute("books", books);
        return "books/index";
    }

    @GetMapping("/view/{isbn}")
    public String getMethodName(@ModelAttribute("isbn") String isbn, Model model) {
        Book book = bookService.findByIsbn(isbn);
        model.addAttribute("book", book);
        return "books/view";
    }
    

    @GetMapping("/add")
    public String create(Model model) {
        Book book = new Book();
        model.addAttribute("book", book);
        return "books/create";
    }

    @PostMapping("/add")
    public String save(@ModelAttribute("book") Book book, Model model) {
        bookService.save(book);
        return "redirect:/books";
    }

    @GetMapping("/update/{isbn}")
    public String edit(@ModelAttribute("isbn") String isbn, Model model) {
        Book book = bookService.findByIsbn(isbn);
        model.addAttribute("book", book);
        return "books/update";
    }
    
    @PostMapping("/update/{isbn}")
    public String edit(@ModelAttribute("book") Book book, Model model) {
        bookService.save(book);
        return "redirect:/books";
    }
    
}
