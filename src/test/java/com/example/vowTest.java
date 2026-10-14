package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class vowTest {
    @Test
    void testVowels() {
        assertEquals(3, vow.count("Hello World"));
    }
    @Test
    void testUppercase() {
        assertEquals(5, vow.count("AEIOU"));
    }
    @Test
    void testNoVowels() {
        assertEquals(0, vow.count("xyz"));
    }
}