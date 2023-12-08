package tests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import src.odd_or_even.*;

// *Задание 1.*
// Напишите тесты, покрывающие на 100% метод evenOddNumber,
// который проверяет, является ли переданное число четным или нечетным.


public class testNumber {
    
    // To fully cover method odd or even from number.java
    // We need to check all possible branches.

    // Check the true branch. Even number.
    @Test
    void testEven () {
        assertTrue(number.evenOddNumber(10));
    }

    // Check the false branch. Odd number.
    @Test
    void testOdd () {
        assertFalse(number.evenOddNumber(3));
    }

    // *Задание 2.*
    // Разработайте и протестируйте метод numberInInterval, который проверяет,
    // попадает ли переданное число в интервал (25;100).

    // To fully cover the method we need to check lower bound num < 25
    // Upper bound num > 100
    // And interval.
    
    @Test
    void testLowerBound () {
        assertFalse(number.numberInInterval(25));
    }

    @Test
    void testInInterval () {
        assertFalse(number.numberInInterval(100));
    }

    @Test
    void testUpperBound () {
        assertFalse(number.numberInInterval(50));
    }
}
