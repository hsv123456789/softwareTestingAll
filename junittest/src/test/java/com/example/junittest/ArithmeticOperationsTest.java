package com.example.junittest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ArithmeticOperationsTest {

  private final  ArithmeticOperations arithmetic = new ArithmeticOperations();

    @Test
    void testAdd() {
  assertEquals(5, arithmetic.add(2, 3));
    }

    @Test
    void testDivide() {
        assertEquals(2.5, arithmetic.divide(5, 2));
    }

    @Test
    void testMultiply() {
        assertEquals(15, arithmetic.multiply(5, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(2, arithmetic.subtract(5, 3));
    }
}
