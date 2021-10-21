package com.company;

import java.util.Scanner;

public class App {
    public static Scanner input = new Scanner(System.in);

    public static void app() {
        boolean stilCalculate = true;
        System.out.println("Welcome to Simple Calculator");
        do {
            System.out.println("Possible operations");
            System.out.println("1 - Addition");
            System.out.println("2 - Subtraction");
            System.out.println("3 - Multiplication");
            System.out.println("4 - Division");
            System.out.print("Choose: ");
            int option = input.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Selected: Addition");
                    System.out.print("Input first operand: ");
                    double a = input.nextDouble();
                    System.out.print("Input second operand: ");
                    double b = input.nextDouble();
                    SimpleCalculator.add(a, b);
                    break;
                case 2:
                    System.out.println("Selected: Subtraction");
                    System.out.print("Input first operand: ");
                    a = input.nextDouble();
                    System.out.print("Input second operand: ");
                    b = input.nextDouble();
                    SimpleCalculator.subtract(a, b);
                    break;
                case 3:
                    System.out.println("Selected: Multiplication");
                    System.out.print("Input first operand: ");
                    a = input.nextDouble();
                    System.out.print("Input second operand: ");
                    b = input.nextDouble();
                    SimpleCalculator.multiply(a, b);
                    break;
                case 4:
                    System.out.println("Selected: Division");
                    System.out.print("Input first operand: ");
                    a = input.nextDouble();
                    System.out.print("Input second operand: ");
                    b = input.nextDouble();
                    SimpleCalculator.divide(a, b);
                    break;
                default:
                    System.out.println("Error: Wrong option");
            }
            input.nextLine(); //clear from input \n
            while (true) {
                System.out.print("Continue? (y/n): ");
                String choice = input.nextLine();
                if (choice.equals("y")) {
                    System.out.println("We will continue");
                    stilCalculate = true;
                    break;
                } else if (choice.equals("n")) {
                    System.out.println("Thank you for using Simple Calculator!");
                    stilCalculate = false;
                    break;
                } else {
                    System.out.println("Error: Invalid Choice");
                }
            }
        } while (stilCalculate);

    }


}
