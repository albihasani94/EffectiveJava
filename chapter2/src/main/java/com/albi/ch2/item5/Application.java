package com.albi.ch2.item5;

import java.util.Map;

// Item 5: Prefer dependency injection to hardwiring resources
public class Application {
    public static void main(String[] args) {
        Map<String, String> dictionary = Map.of("Dog", "Good Animal",
                "Snake", "Bad Animal",
                "Bat", "Animal you should never eat because of coronaviruses u idiot"
        );

        SpellChecker spellChecker = new SpellChecker(dictionary);

        System.out.println(spellChecker.isValid("Snake"));
        System.out.println(spellChecker.getDefinition("Bat"));
        System.out.println(spellChecker.isValid("Cat"));
        System.out.println(spellChecker.getDefinition("Cat"));
    }
}
