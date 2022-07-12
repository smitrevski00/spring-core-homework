package com.endava.springcorehomework.config;

import com.endava.springcorehomework.models.Author;
import com.endava.springcorehomework.models.Book;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class DataHolder {

    private static Long ID = 1L;

    public static List<Author> generateAuthors = List.of(
            new Author("Marko", "Cepenkov", "Macedonia", LocalDate.of(1854, 3, 24)),
            new Author("Stale", "Popov", "Macedonia", LocalDate.of(1884, 7, 13)),
            new Author("Gligor", "Prlichev", "Macedonia", LocalDate.of(1826, 9, 7)));

    public static List<Book> generateBooks = List.of(
            new Book("Marta", 120, BigDecimal.valueOf(150), generateAuthors.get(1)),
            new Book("Itar Pejo", 200, BigDecimal.valueOf(250), generateAuthors.get(2)),
            new Book("Sonce", 450, BigDecimal.valueOf(400), generateAuthors.get(0)));

    public static Long idGenerator() {
        return ID++;
    }

    public static void resetId() {
        ID = 1L;
    }
}
