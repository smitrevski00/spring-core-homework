package com.endava.springcorehomework.repository.impl;

import com.endava.springcorehomework.config.DataHolder;
import com.endava.springcorehomework.models.Book;
import com.endava.springcorehomework.repository.BookRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("bookRepository")
public class BookRepositoryImpl implements BookRepository {
    @Override
    public List<Book> findAll() {
        DataHolder.resetId();
        return DataHolder.generateBooks;
    }

    @Override
    public Optional<Book> findByAuthorName(String authorName) {
        return DataHolder.generateBooks.stream()
                .filter(book -> book.getAuthor().getName().equals(authorName))
                .findFirst();
    }
}
