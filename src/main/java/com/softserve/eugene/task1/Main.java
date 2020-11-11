package com.softserve.eugene.task1;

import com.softserve.eugene.task2.ComplexMath;
import com.softserve.eugene.task3.QuadraticEquation;
import com.softserve.eugene.task4.NumeralSystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("\n\nIt's time to choose:\n\n" +
                        "1 - Basic operation on complex numbers.\n" +
                        "2 - Quadratic equations with complex roots.\n" +
                        "3 - Convert number from one numeral system to another.\n" +
                        "0 - Quit program.\n");
                int choice = scanner.nextInt();

                if (choice == 1) {
                    ComplexMath.go();
                } else if (choice == 2) {
                    QuadraticEquation.go();
                } else if (choice == 3) {
                    NumeralSystem.go();
                } else if (choice == 0) {
                    System.exit(0);
                } else {
                    throw new InputMismatchException();
                }
                System.out.println("\n\nPress Enter key to continue...");
                System.in.read();
            } catch (InputMismatchException ex) {
                System.out.println("\nInvalid value");
            } catch (Exception e) {
            }
        }
    }
}