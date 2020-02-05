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
}
