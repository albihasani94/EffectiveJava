package com.albi.ch2.item3;

public class SingletonFirst {
    public static final SingletonFirst INSTANCE = new SingletonFirst();

    private SingletonFirst() {
        System.out.println(String.format("Constructor %s called...", this.getClass()));
    }

    public void sayHello() {
        System.out.println(String.format("Hello! ==%s==", this.getClass()));
    }
}
