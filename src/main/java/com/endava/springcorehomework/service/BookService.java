package com.endava.springcorehomework.service;

import com.endava.springcorehomework.models.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> listAll();
    Optional<Book> findByAuthorName(String authorName);
}
