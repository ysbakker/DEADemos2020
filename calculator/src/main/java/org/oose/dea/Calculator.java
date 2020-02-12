package org.oose.dea;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator ();

        calculator.setCustomCalculation((x, y) -> {
            int z = 100;
            return 2*x+y+100;
        });

        System.out.println(calculator.performCustomCalculation(5,6));
    }


    private CustomCalculation customCalculation;


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

    public int performCustomCalculation (int x, int y){
        return customCalculation.calculate(x,y);
    }

    public void setCustomCalculation(CustomCalculation customCalculation){
        this.customCalculation = customCalculation;
    }

}
