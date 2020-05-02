package com.albi.ch6.item39;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunTests2 {
    public static void main(String[] args) throws ClassNotFoundException {
        int tests = 0;
        int passed = 0;

        Class<?> testClass = Class.forName(args[0]);
        for (Method m : testClass.getDeclaredMethods()) {
            if (m.isAnnotationPresent(ExceptionTest.class)) {
                tests++;
                try {
                    m.invoke(null);
                    System.out.printf("Test %s failed: no exception%n", m);
                } catch (InvocationTargetException wrappedException) {
                    Throwable exception = wrappedException.getCause();
                    Class<? extends Throwable> exceptionType = m.getAnnotation(ExceptionTest.class).value();
                    if (exceptionType.isInstance(exception)) {
                        passed++;
                    } else {
                        System.out.printf("Test %s failed: expected %s, got %s%n",
                                m, exceptionType.getName(), exception);
                    }
                } catch (Exception e) {
                    System.out.println("Invalid @Test: " + m);
                }
            }
        }

        System.out.printf("Passed: %d, Failed: %d%n", passed, tests - passed);
    }
}
