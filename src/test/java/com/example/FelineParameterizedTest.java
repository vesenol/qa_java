package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class FelineParameterizedTest {
    private final Feline feline = new Feline();

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 3, 5, Integer.MAX_VALUE})
    void testGetKittensWithCount(int count) {
        assertEquals(count, feline.getKittens(count));

        Cat cat = new Cat(feline);
        assertEquals(count, cat.getKittens(count));
    }
}
