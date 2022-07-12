package com.endava.springcorehomework;

import com.endava.springcorehomework.config.AppConfig;
import com.endava.springcorehomework.service.AuthorService;
import com.endava.springcorehomework.service.BookService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringCoreHomeworkApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        AuthorService authorService = applicationContext.getBean("authorService", AuthorService.class);
        BookService bookService = applicationContext.getBean("bookService", BookService.class);

        System.out.println("Authors: ");
        authorService.listAll().forEach(System.out::println);

        System.out.println("Books: ");
        bookService.listAll().forEach(System.out::println);

        System.out.println("Books by author with the name Marko:");
        System.out.println(bookService.findByAuthorName("Marko").isPresent()
                ? bookService.findByAuthorName("Marko").get()
                : "No book by the author Marko");
    }
}
