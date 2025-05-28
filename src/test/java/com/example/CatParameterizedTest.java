package com.example;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CatParameterizedTest {
    @Mock
    Feline feline;

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 3, 5})
    void testGetKittensWithCount(int count) {
        Cat cat = new Cat(feline);
        when(feline.getKittens(count)).thenReturn(count);
        assertEquals(count, cat.getKittens(count));
    }
}
