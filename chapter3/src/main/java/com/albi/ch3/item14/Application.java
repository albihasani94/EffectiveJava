package com.albi.ch3.item14;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Application {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal("1.0");
        BigDecimal b2 = new BigDecimal("1.00");

        Set<BigDecimal> set1 = new HashSet<>();
        set1.add(b1);
        set1.add(b2);

        set1.forEach(System.out::println);

        Set<BigDecimal> set2 = new TreeSet<>();
        set2.add(b1);
        set2.add(b2);

        set2.forEach(System.out::println);
    }
}
