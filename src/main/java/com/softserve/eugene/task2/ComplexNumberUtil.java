package com.softserve.eugene.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ComplexNumberUtil {
    public static void go() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter the real part of the first equation:");
        double real = scanner.nextDouble();
        System.out.println("Enter the imaginary part of the first equation:");
        double imag = scanner.nextDouble();
        ComplexNumber first = new ComplexNumber(real, imag);

        System.out.println("Enter the real part of the second equation:");
        real = scanner.nextDouble();
        System.out.println("Enter the imaginary part of the second equation:");
        imag = scanner.nextDouble();
        ComplexNumber second = new ComplexNumber(real, imag);

        System.out.println("Enter the desired operation on complex numbers (+, -, *, /):");
        char operation = scanner.next().charAt(0);
        ComplexNumber result;

        switch (operation) {
            case ('+'):
                result = ComplexNumberMath.add(first, second);
                break;
            case ('-'):
                result = ComplexNumberMath.substract(first, second);
                break;
            case ('*'):
                result = ComplexNumberMath.multiply(first, second);
                break;
            case ('/'):
                result = ComplexNumberMath.divide(first, second);
                break;
            default:
                throw new InputMismatchException();
        }

        System.out.println("Your answer: " + result.toString());
    }
}
