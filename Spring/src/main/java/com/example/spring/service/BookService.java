package com.example.spring.service;

import com.example.spring.mapper.BookMapper;
import com.example.spring.models.Book;
import com.example.spring.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BookService {

    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    public Book getBook(String isbn) {
        return bookMapper.toBook(bookRepository.findByIsbn(isbn));
    }
}
