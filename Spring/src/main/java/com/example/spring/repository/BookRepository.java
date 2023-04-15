package com.example.spring.repository;

import com.example.spring.persistence.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, String> {

    public BookEntity findByIsbn(String isbn);
}
