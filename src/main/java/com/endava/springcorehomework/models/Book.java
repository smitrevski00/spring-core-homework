package com.endava.springcorehomework.models;

import com.endava.springcorehomework.config.DataHolder;
import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@Data
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

    @Override
    public String toString() {
        return String.format("ID: %d\nTitle: %s\nNum. pages: %d\nPrice: %s\nAuthor: %s\n",
                id, title, numberOfPages, price, author.getFullName());
    }
}
