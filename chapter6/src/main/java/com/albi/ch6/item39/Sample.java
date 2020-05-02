package com.albi.ch6.item39;

public class Sample {
    @Test
    public static void m1() { // will pass
    }

    public static void m2() {
    }

    @Test
    public static void m3() { // will fail
        throw new RuntimeException("Boom");
    }

    public static void m4() {
    }

    @Test
    public void m5() { // it is invalid
    }

    public static void m6() {
    }

    @Test
    public static void m7() { // will fail
        throw new RuntimeException("Crash");
    }

    public static void m8() {
    }
}
