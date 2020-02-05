package org.oose.dea;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAdd(){
        Calculator calculator = new Calculator ();
        assertEquals(4,calculator.add(2,2));
        assertEquals(100,calculator.add(25,75));
    }

    @Test
    public void testSubstract() {
        Calculator c = new Calculator();
        assertEquals(100, c.subtract(105,5));
        assertEquals(10, c.subtract(200,190));
    }

    @Test
    public void testTimes() {
        Calculator c = new Calculator();
        assertEquals(100, c.times(10,10));
        assertEquals(69, c.times(3,23));
    }

    @Test
    public void testDivide() {
        Calculator c = new Calculator();
        assertEquals(1, c.divide(100,100));
        assertEquals(20, c.divide(120,6));
    }
}
