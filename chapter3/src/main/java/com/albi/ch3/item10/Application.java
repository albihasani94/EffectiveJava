package com.albi.ch3.item10;

import java.util.regex.Pattern;

public class Application {
    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("test");
        Pattern p2 = Pattern.compile("test");
        System.out.println(p1.equals(p2));

        PhoneNumber ph1 = new PhoneNumber(111, 222, 333);
        PhoneNumber ph2 = new PhoneNumber(11, 22, 33);
        PhoneNumber ph3 = new PhoneNumber(111, 222, 333);

        System.out.println(ph1.equals(ph2));
        System.out.println(ph2.equals(ph3));
        System.out.println(ph1.equals(ph3));
    }
}
