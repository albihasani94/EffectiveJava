package com.albi.ch4.item17;

public class Complex {
    private final double real;
    private final double imaginary;

    private Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public static final Complex ZERO = new Complex(0, 0);
    public static final Complex ONE = new Complex(1, 0);
    public static final Complex I = new Complex(0, 1);

    public static Complex valueOf(double real, double imaginary) {
        return new Complex(real, imaginary);
    }

    public double realPart() {
        return real;
    }

    public double imaginaryPart() {
        return imaginary;
    }

    public Complex plus(Complex anotherComplex) {
        return new Complex(real + anotherComplex.real, imaginary + anotherComplex.imaginary);
    }

    public Complex minus(Complex anotherComplex) {
        return new Complex(real - anotherComplex.real, imaginary - anotherComplex.imaginary);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Complex complex = (Complex) o;
        return Double.compare(complex.real, real) == 0 &&
                Double.compare(complex.imaginary, imaginary) == 0;
    }

    @Override
    public int hashCode() {
        return 31 * Double.hashCode(real) + Double.hashCode(imaginary);
    }

    @Override
    public String toString() {
        return "Complex{" +
                "real=" + real +
                ", imaginary=" + imaginary +
                '}';
    }
}
