package com.endava.springcorehomework.service.impl;

import com.endava.springcorehomework.models.Book;
import com.endava.springcorehomework.repository.BookRepository;
import com.endava.springcorehomework.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("bookService")
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> listAll() {
        return bookRepository.findAll();
    }

    @Override
    public Optional<Book> findByAuthorName(String authorName) {
        return bookRepository.findByAuthorName(authorName);
    }
}
