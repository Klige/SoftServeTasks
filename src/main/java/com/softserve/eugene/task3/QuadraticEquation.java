package com.softserve.eugene.task3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class QuadraticEquation {

    public static void go() throws InputMismatchException {
        double a, b, c, root1, root2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter the value of a:");
        a = scanner.nextDouble();

        if (a == 0) {
            throw new InputMismatchException();
        }

        System.out.println("Enter the value of b:");
        b = scanner.nextDouble();
        System.out.println("Enter the value of c:");
        c = scanner.nextDouble();
        double determinant = b * b - 4 * a * c;

        if (determinant > 0) {
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            System.out.format("Root1 = %.2f; Root2 = %.2f.", root1, root2);
        }
        else if (determinant == 0) {
            root1 = root2 = -b / (2 * a);
            System.out.format("Roots are equal. Root1 = Root2 = %.2f.", root1);
        }
        else {
            double real = -b / (2 *a);
            double imag = Math.sqrt(-determinant) / (2 * a);
            System.out.format("Roots are complex. Root1 = %.2f + %.2fi; Root2 = %.2f - %.2fi.", real, imag, real, imag);
        }
    }
}
