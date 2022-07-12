package com.endava.springcorehomework.models;

import com.endava.springcorehomework.config.DataHolder;
import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@Data
@ToString
@Builder
public class Book {
    private Long id;
    private String title;
    private Integer numberOfPages;
    private BigDecimal price;
    private Author author;

    public Book(String title, Integer numberOfPages, BigDecimal price, Author author) {
        this.id = DataHolder.idGenerator();
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.author = author;
    }

    public Book() {
        this.id = DataHolder.idGenerator();
    }
}
