package com.endava.springcorehomework.models;

import com.endava.springcorehomework.config.DataHolder;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@Data
@ToString
@Builder
public class Author {
    private Long id;
    private String name;
    private String surname;
    private String country;
    private LocalDate dateOfBirth;

    public Author(String name, String surname, String country, LocalDate dateOfBirth) {
        this.id = DataHolder.idGenerator();
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.dateOfBirth = dateOfBirth;
    }

    public Author() {
        this.id = DataHolder.idGenerator();
    }
}
