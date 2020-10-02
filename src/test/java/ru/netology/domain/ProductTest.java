package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    private Product addBook1 = new Product(1, "Name1", 500);

    @Test
    public void shouldEqualsName() {
        boolean actual = addBook1.matches("Name1");
        assertEquals(true, actual);
    }

    @Test
    public void shouldNotEqualsName() {
        boolean actual = addBook1.matches("Name100");
        assertEquals(false, actual);
    }

    @Test
    public void shouldNotEqualsIfNull() {
        boolean actual = addBook1.matches("");
        assertEquals(false, actual);
    }



}