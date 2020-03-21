package com.albi.ch2.item3;

public class SingletonSecond {
    private static final SingletonSecond INSTANCE = new SingletonSecond();

    private SingletonSecond() {
        System.out.println(String.format("Constructor %s called...", this.getClass()));
    }

    public static SingletonSecond getInstance() {
        return INSTANCE;
    }

    public void sayHello() {
        System.out.println(String.format("Hello! ==%s==", this.getClass()));
    }
}
