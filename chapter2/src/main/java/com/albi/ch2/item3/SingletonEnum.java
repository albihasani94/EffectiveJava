package com.albi.ch2.item3;

public enum SingletonEnum {
    INSTANCE;

    SingletonEnum() {
        System.out.println(String.format("Constructor %s called...", this.getClass()));
    }

    public void sayHello() {
        System.out.println("Hello!");
    }
}
