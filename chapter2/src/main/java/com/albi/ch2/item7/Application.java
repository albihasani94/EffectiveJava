package com.albi.ch2.item7;

import java.util.WeakHashMap;

// Item 7: Eliminate obsolete object references
public class Application {
    public static void main(String[] args) throws InterruptedException {

        Person first = new Person(25, "John");
        Person second = new Person(100, "Maria");

        WeakHashMap<Person, String> weakHashMap = new WeakHashMap<>();
        weakHashMap.put(first, first.getName());
        weakHashMap.put(second, second.getName());

        first = null;
        System.out.println(weakHashMap);
        System.gc();

        while (weakHashMap.size() == 2) {
            System.out.println(weakHashMap.size());
            Thread.sleep(1000);
        }

        System.out.println(weakHashMap.size());
        System.out.println(weakHashMap);

    }
}
