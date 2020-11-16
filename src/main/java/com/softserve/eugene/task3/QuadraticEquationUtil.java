package com.softserve.eugene.task3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class QuadraticEquationUtil {

    public static void go() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter the value of a (ax^2+bx+c):");
        double a = scanner.nextDouble();

        if (a == 0) {
            throw new InputMismatchException();
        }

        System.out.println("Enter the value of b (ax^2+bx+c):");
        double b = scanner.nextDouble();
        System.out.println("Enter the value of c (ax^2+bx+c):");
        double c = scanner.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        QuadraticEquationMath.resolveQuadraticEquation(equation);
        System.out.println(equation.toString());
    }
}
