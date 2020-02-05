package org.oose.dea;

public class Calculator {

    public int add(int value1, int value2) {
        return value1 + value2;
    }

    public int subtract(int value1, int value2) {
        return value1 - value2;
    }

    public int times(int value1, int value2) {
        return value1 * value2;
    }

    public double divide(double value1, double value2) {
        if (value2 == 0){
            throw new IllegalArgumentException("Delen door nul is flauwekul en helemaal niet infinity");
        }

        return (double) (value1 / value2);
    }
}
