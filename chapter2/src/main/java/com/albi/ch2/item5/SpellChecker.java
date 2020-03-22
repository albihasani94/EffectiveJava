package com.albi.ch2.item5;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class SpellChecker {
    private final Map<String, String> dictionary;

    public SpellChecker(Map<String, String> dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary);
    }

    public boolean isValid(String word) {
        return dictionary.containsKey(word);
    }

    public String getDefinition(String word) {
        return isValid(word) ? dictionary.get(word) : "Word not found in dictionary";
    }

    public List<String> suggestions(String typo) {
        // TODO: Offer some suggestions
        return Collections.emptyList();
    }
}
