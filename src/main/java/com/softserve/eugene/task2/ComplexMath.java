package com.softserve.eugene.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ComplexMath {

    double real, imag;

    public ComplexMath(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public static void go() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter the real part of the first equation:");
        double real1 = scanner.nextDouble();
        System.out.println("Enter the imaginary part of the first equation:");
        double imag1 = scanner.nextDouble();
        ComplexMath first = new ComplexMath(real1, imag1);

        System.out.println("Enter the real part of the second equation:");
        double real2 = scanner.nextDouble();
        System.out.println("Enter the imaginary part of the second equation:");
        double imag2 = scanner.nextDouble();
        ComplexMath second = new ComplexMath(real2, imag2);

        System.out.println("Enter the desired operation on complex numbers (+, -, *, /):");
        char op = scanner.next().charAt(0);
        ComplexMath result;

        if (op == '+') {
            result = new ComplexMath(first.real + second.real, first.imag + second.imag);
        }
        else if (op == '-') {
            result = new ComplexMath(first.real - second.real, first.imag - second.imag);
        }
        else if (op == '*') {
            result = new ComplexMath(first.real * second.real, first.imag * second.imag);
        }
        else if (op == '/') {
            result = new ComplexMath(first.real / second.real, first.imag / second.imag);
        }
        else {
            throw new InputMismatchException();
        }

        if (result.real == 0 && result.imag == 0) {
            System.out.println("Your answer: " + 0);
        }
        else if (result.real == 0) {
            System.out.format("Your answer: %.2fi", result.imag);
        }
        else if (result.imag == 0) {
            System.out.format("Your answer: %.2f", result.real);
        }
        else {
            System.out.format("Your answer: %.2f" + ((result.imag >= 0) ? " + " : " - ") + "%.2fi", result.real, Math.abs(result.imag));
        }
    }
}
