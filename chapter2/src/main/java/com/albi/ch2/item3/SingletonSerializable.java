package com.albi.ch2.item3;

import java.io.Serializable;

public class SingletonSerializable implements Serializable {

    private static final transient SingletonSerializable INSTANCE = new SingletonSerializable();

    private SingletonSerializable() {
        System.out.println(String.format("Constructor %s called...", this.getClass()));
    }

    public static SingletonSerializable getInstance() {
        return INSTANCE;
    }

    public void sayHello() {
        System.out.println(String.format("Hello! ==%s==", this.getClass()));
    }

    private Object readResolve() {
        return INSTANCE;
    }

}
