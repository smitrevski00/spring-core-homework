package com.endava.springcorehomework.service.impl;

import com.endava.springcorehomework.models.Author;
import com.endava.springcorehomework.repository.AuthorRepository;
import com.endava.springcorehomework.service.AuthorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("authorService")
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public List<Author> listAll() {
        return authorRepository.findAll();
    }
}
