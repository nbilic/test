package com.example.spring.mapper;

import com.example.spring.models.Book;
import com.example.spring.persistence.BookEntity;

public class BookMapper {

    public Book toBook(BookEntity bookEntity) {
        return  new Book(bookEntity.getName(), bookEntity.getAuthor());
    }
}
