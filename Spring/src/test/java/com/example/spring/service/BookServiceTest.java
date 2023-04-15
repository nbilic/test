package com.example.spring.service;

import com.example.spring.models.Book;
import com.example.spring.persistence.BookEntity;
import com.example.spring.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.assertj.core.api.BDDAssertions;
import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;

@AllArgsConstructor
public class BookServiceTest {

    private final BookRepository bookRepository;
    private final BookService bookService;

    @Test
    void shouldGetBook() {
        // given
        var bookEntity = new BookEntity("123", "My Book", "Some Guy");
        var expectedBook = new Book("My Book", "Some Guy");
        given(bookRepository.findByIsbn(anyString())).willReturn(bookEntity);

        // when
        var book = bookService.getBook("123");

        // then
        BDDAssertions.then(book).isEqualTo(expectedBook);

    }
}
