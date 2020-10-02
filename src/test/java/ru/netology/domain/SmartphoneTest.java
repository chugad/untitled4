package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {
    private Smartphone addSmartphone1 = new Smartphone(6, "Name6", 5_000, "Producer1");

    @Test
    public void shouldEqualsName() {
        boolean actual = addSmartphone1.matches("Name6");
        assertEquals(true, actual);
    }

    @Test
    public void shouldNotEqualsName() {
        boolean actual = addSmartphone1.matches("Name1");
        assertEquals(false, actual);
    }

    @Test
    public void shouldNotEqualsIfNull() {
        boolean actual = addSmartphone1.matches("");
        assertEquals(false, actual);
    }

    @Test
    public void shouldEqualsProducer() {
        boolean actual = addSmartphone1.matches("Producer1");
        assertEquals(true, actual);
    }

    @Test
    public void shouldNotEqualsProducer() {
        boolean actual = addSmartphone1.matches("Producer100");
        assertEquals(false, actual);
    }

}