package com.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumberGeneratorTest {

    @Test
    public void whenMethodGeneratorCalledThenReturnRandomNumberBetweenZeroAndTwo_PositiveTest() {

        NumberGenerator numberGenerator = new NumberGenerator();
        numberGenerator.setBound(3);
        int i = numberGenerator.numberGenerator();
        assertEquals(true, (i <= 2) && (i >= 0));
    }

    @Test
    public void whenMethodGeneratorCalledThenReturnRandomNumberBetweenZeroAndTwo_NegativeTest() {

        NumberGenerator numberGenerator = new NumberGenerator();
        numberGenerator.setBound(3);
        int i = numberGenerator.numberGenerator();
        assertNotEquals(true, (i > 2) || (i < 0));
    }
}
