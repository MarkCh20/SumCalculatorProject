package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

 class SumCalculatorTest {

    private SumCalculator sumCalculator;

    @BeforeEach
     void setUp() {
        sumCalculator = new SumCalculator();
    }

    @Test
    void testSumOf1() {
        assertEquals(1, sumCalculator.sum(1));
    }

    @Test
    void testSumOf3() {
        assertEquals(6, sumCalculator.sum(3)); // 1 + 2 + 3 = 6
    }

    @Test
    void testSumOf0() {
        assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(0));
    }

    @Test
    void testSumOfNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(-1));
    }
}
