package com.albi.ch6.item39;

public class Sample2 {
    @ExceptionTest(ArithmeticException.class)
    public static void m1() { // test should pass
        int i = 0;
        i = i / i;
    }

    @ExceptionTest(ArithmeticException.class)
    public static void m2() { // should fail, no exception

    }

    @ExceptionTest(ArithmeticException.class)
    public static void m3() { // should fail, wrong exception
        throw new RuntimeException("Boom");
    }
}
