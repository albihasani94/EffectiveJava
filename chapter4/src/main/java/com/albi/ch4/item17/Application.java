package com.albi.ch4.item17;

import java.math.BigInteger;

public class Application {
    public static void main(String[] args) {
        BigInteger bigInteger = BigInteger.ONE;
        // The add method obeys to the functional approach; it does not modify the operand, it returns a new result
        bigInteger.add(BigInteger.TWO);
        System.out.println(bigInteger);

        Complex complex = Complex.valueOf(4, 2);
        Complex anotherComplex = Complex.valueOf(2, 1);

        complex = complex.minus(anotherComplex);
        System.out.println(complex);

        complex = complex.minus(Complex.ONE);
        System.out.println(complex);
    }
}
