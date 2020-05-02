package com.albi.ch6.item39;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunTests {
    public static void main(String[] args) throws ClassNotFoundException {
        int tests = 0;
        int passed = 0;

        Class<?> testClass = Class.forName(args[0]);
        for (Method m : testClass.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Test.class)) {
                tests++;
                try {
                    m.invoke(null);
                    passed++;
                } catch (InvocationTargetException wrappedException) {
                    Throwable exception = wrappedException.getCause();
                    System.out.println(m + " failed: " + exception);
                } catch (Exception e) {
                    System.out.println("Invalid @Test: " + m);
                }
            }
        }

        System.out.printf("Passed: %d, Failed: %d%n", passed, tests - passed);
    }
}
