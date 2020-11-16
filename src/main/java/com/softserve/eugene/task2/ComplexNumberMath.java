package com.softserve.eugene.task2;

public class ComplexNumberMath {

    private ComplexNumberMath() {
    }

    public static ComplexNumber add(ComplexNumber first, ComplexNumber second) {
        double real = first.getReal() + second.getReal();
        double imag = first.getImag() + second.getImag();
        return new ComplexNumber(real, imag);
    }

    public static ComplexNumber substract(ComplexNumber first, ComplexNumber second) {
        double real = first.getReal() - second.getReal();
        double imag = first.getImag() - second.getImag();
        return new ComplexNumber(real, imag);
    }

    public static ComplexNumber multiply(ComplexNumber first, ComplexNumber second) {
        double real = first.getReal() * second.getReal() - first.getImag() * second.getImag();
        double imag = first.getReal() * second.getImag() + first.getImag() * second.getReal();
        return new ComplexNumber(real, imag);
    }

    public static ComplexNumber divide(ComplexNumber first, ComplexNumber second) {
        double denominator = Math.pow(second.getReal() + second.getImag(), 2);
        double real = (first.getReal() * second.getReal() - first.getImag() * second.getImag()) / denominator;
        double imag = (-first.getReal() * second.getImag() + first.getImag() * second.getReal()) / denominator;
        return new ComplexNumber(real, imag);
    }
}
