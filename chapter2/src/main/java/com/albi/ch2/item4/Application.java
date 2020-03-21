package com.albi.ch2.item4;

// Item 4: Enforce noninstantiability with a private constructor
public class Application {
    public static void main(String[] args) {
        UtilityClass.makeMusic();

        // Class cannot be instantiated; because it shouldn't
        // UtilityClass utility = new UtilityClass();
    }
}
