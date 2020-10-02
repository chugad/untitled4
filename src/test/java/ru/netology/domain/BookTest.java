package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    private Book addBook2 = new Book(2, "Name2", 600, "Author2");

    @Test
    public void shouldEqualsName() {
        boolean actual = addBook2.matches("Name2");
        assertEquals(true, actual);
    }

    @Test
    public void shouldNotEqualsName() {
        boolean actual = addBook2.matches("Name1");
        assertEquals(false, actual);
    }

    @Test
    public void shouldNotEqualsIfNull() {
        boolean actual = addBook2.matches("");
        assertEquals(false, actual);
    }

    @Test
    public void shouldEqualsProducer() {
        boolean actual = addBook2.matches("Author2");
        assertEquals(true, actual);
    }

    @Test
    public void shouldNotEqualsProducer() {
        boolean actual = addBook2.matches("Author200");
        assertEquals(false, actual);
    }


}