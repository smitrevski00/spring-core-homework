package com.endava.springcorehomework.repository;

import com.endava.springcorehomework.models.Author;

import java.util.List;

public interface AuthorRepository {
    List<Author> findAll();
}
