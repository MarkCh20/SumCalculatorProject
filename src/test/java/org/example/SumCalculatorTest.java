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
     void givenPositiveInputOne_whenSum_thenReturnsOne() {
         // Given
         int input = 1;

         // When
         int actualSum = sumCalculator.sum(input);

         // Then
         int expectedSum = 1;
         assertEquals(expectedSum, actualSum);
     }

     @Test
     void givenPositiveInputThree_whenSum_thenReturnsSix() {
         // Given
         int input = 3;

         // When
         int actualSum = sumCalculator.sum(input);

         // Then
         int expectedSum = 6; // 1 + 2 + 3
         assertEquals(expectedSum, actualSum);
     }

     @Test
     void givenZeroInput_whenSum_thenThrowsIllegalArgumentException() {
         // Given
         int input = 0;

         // When / Then
         assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(input));
     }

     @Test
     void givenNegativeInput_whenSum_thenThrowsIllegalArgumentException() {
         // Given
         int input = -1;

         // When / Then
         assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(input));
     }

 }
