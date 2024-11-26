package dev.exercise;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import model.DniCalculator;

public class DniCalculatorTest {

    @Test
    public void testValidDniNumber() {
        DniCalculator calculator = new DniCalculator();
        assertEquals('T', calculator.calculateDniLetter(0));
        assertEquals('R', calculator.calculateDniLetter(1));
        assertEquals('N', calculator.calculateDniLetter(15151515));
    }

    @Test
    public void testInvalidDniNumberLow() {
        DniCalculator calculator = new DniCalculator();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calculator.calculateDniLetter(-1));
        assertEquals("DNI number must be between 0 and 99,999,999.", exception.getMessage());
    }

    @Test
    public void testInvalidDniNumberHigh() {
        DniCalculator calculator = new DniCalculator();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calculator.calculateDniLetter(100000000));
        assertEquals("DNI number must be between 0 and 99,999,999.", exception.getMessage());
    }
}
