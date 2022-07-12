package com.endava.springcorehomework.repository.impl;

import com.endava.springcorehomework.config.DataHolder;
import com.endava.springcorehomework.models.Author;
import com.endava.springcorehomework.repository.AuthorRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("authorRepository")
public class AuthorRepositoryImpl implements AuthorRepository {

    @Override
    public List<Author> findAll() {
        DataHolder.resetId();
        return DataHolder.generateAuthors;
    }
}
