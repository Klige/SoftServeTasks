package com.softserve.eugene.task2;

public class ComplexNumber {

    private double real;
    private double imag;

    public ComplexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public String toString() {
        if (real == 0 && imag == 0) {
            return 0 + "";
        }
        else if (imag == 0) {
            return real + "";
        }
        else if (real == 0) {
            return imag + "i";
        }
        else if (imag <  0) {
            return real + " - " + (-imag) + "i";
        }
        else {
            return real + " + " + imag + "i";
        }
    }
}
