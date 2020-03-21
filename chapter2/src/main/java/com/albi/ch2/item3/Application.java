package com.albi.ch2.item3;

// Item 3: Enforce the singleton property with a private constructor or an enum type
public class Application {
    public static void main(String[] args) {
        SingletonFirst firstInstance = SingletonFirst.INSTANCE;
        firstInstance.sayHello();
        SingletonFirst anotherFirstInstance = SingletonFirst.INSTANCE;
        anotherFirstInstance.sayHello();

        SingletonSecond secondInstance = SingletonSecond.getInstance();
        secondInstance.sayHello();
        SingletonSecond anotherSecondInstance = SingletonSecond.getInstance();
        anotherSecondInstance.sayHello();

        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
        singletonEnum.sayHello();
        SingletonEnum anotherEnum = SingletonEnum.INSTANCE;
        anotherEnum.sayHello();
    }

}
