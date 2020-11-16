package com.softserve.eugene.task1;

import com.softserve.eugene.task2.ComplexNumberUtil;
import com.softserve.eugene.task3.QuadraticEquationUtil;
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

                switch (choice) {
                    case (0):
                        System.exit(0);
                        break;
                    case (1):
                        ComplexNumberUtil.go();
                        break;
                    case (2):
                        QuadraticEquationUtil.go();
                        break;
                    case (3):
                        NumeralSystem.go();
                        break;
                    default:
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
