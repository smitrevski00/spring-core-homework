package com.endava.springcorehomework.repository;

import com.endava.springcorehomework.models.Book;

import java.util.List;
import java.util.Optional;

public interface BookRepository {
    List<Book> findAll();

    Optional<Book> findByAuthorName(String authorName);
}
