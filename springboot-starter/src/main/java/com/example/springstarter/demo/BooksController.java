package com.example.springstarter.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

//The business logic
@RestController
public class BooksController {
    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return Arrays.asList(new Book(1l, "Harry Potter", "JK"));
    }
}
