package org.oose.dea;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {


    private static Calculator calculator;

    @BeforeAll
    public static void init(){
        calculator = new Calculator();
    }

    @Test
    public void testAdd(){

        assertEquals(4, calculator.add(2,2));
        assertEquals(100, calculator.add(25,75));
    }

    @Test
    public void testSubstract() {
        assertEquals(100, calculator.subtract(105,5));
        assertEquals(10, calculator.subtract(200,190));
    }

    @Test
    public void testTimes() {
        assertEquals(100, calculator.times(10,10));
        assertEquals(69, calculator.times(3,23));
    }

    @Test
    public void testDivide() {
        double expected = 10.0/3.0;
        assertEquals(expected, calculator.divide(10.0,3.0));
        assertEquals(20.0, calculator.divide(120.0,6.0));

    }

    @Test
    public void testDivideByZero(){
        assertThrows(IllegalArgumentException.class,
                () -> {
                    calculator.divide(100,0);
                }
                );
    }
}
