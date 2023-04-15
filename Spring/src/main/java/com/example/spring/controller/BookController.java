package com.example.spring.controller;

import com.example.spring.models.Book;
import com.example.spring.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RestController;

@RestController("/books")
@AllArgsConstructor
public class BookController {

    public final BookService bookService;

    public Book findBook(@Param("isbn") String isbn) {
        return bookService.getBook(isbn);
    }
}
