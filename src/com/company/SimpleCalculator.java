package com.company;

public class SimpleCalculator {
    public static void add(double a, double b) {
        double result = a + b;
        if (result % 1 == 0) {
            System.out.println((int) result);
        } else {
            System.out.println(result);
        }
    }

    public static void subtract(double a, double b) {
        double result = a - b;
        if (result % 1 == 0) {
            System.out.println((int) result);
        } else {
            System.out.println(result);
        }
    }

    public static void multiply(double a, double b) {
        double result = a * b;
        if (result % 1 == 0) {
            System.out.println((int) result);
        } else {
            System.out.println(result);
        }
    }

    public static void divide(double a, double b) {
        if (b == 0.0) {
            System.out.println("Error: Can't divide by zero");
        } else {
            double result = a / b;
            if (result % 1 == 0) {
                System.out.println((int) result);
            } else {
                System.out.println(result);
            }
        }
    }

}
