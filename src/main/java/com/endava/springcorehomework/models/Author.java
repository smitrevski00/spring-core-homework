package com.endava.springcorehomework.models;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class Author {
    private String name;
    private String surname;
    private String country;
    private Date dateOfBirth;
}
