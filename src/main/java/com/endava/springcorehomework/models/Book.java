package com.endava.springcorehomework.models;

import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class Book {
    private String title;
    private Integer numberOfPages;
    private BigDecimal price;
    private Author author;
}
