package com.albi.ch3.item3;

import java.util.regex.Pattern;

public class Application {
    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("test");
        Pattern p2 = Pattern.compile("test");
        System.out.println(p1.equals(p2));
    }
}
