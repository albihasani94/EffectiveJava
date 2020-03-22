package com.albi.ch2.item8;

public class Teenager {
    public static void main(String[] args) {
        // Does not call close()
        new Room(99);
        System.out.println("Peace out");

        // It may clean the resources; but it's not guaranteed
        System.gc();
    }
}
