package com.softserve.eugene.task4;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NumeralSystem {

    public static void go() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nTo convert a value to decimal, write 10;\nTo convert a value to quinary, write 5:");
        int choice = scanner.nextInt();
        System.out.println("Write a number:");

        if (choice == 10) {
            BigInteger number = scanner.nextBigInteger(5);
            System.out.println("Your answer is: " + number.toString(10));
        }
        else if (choice == 5) {
            BigInteger number = scanner.nextBigInteger(10);
            System.out.println("Your answer is: " + number.toString(5));
        }
        else {
            throw new InputMismatchException();
        }
    }
}
