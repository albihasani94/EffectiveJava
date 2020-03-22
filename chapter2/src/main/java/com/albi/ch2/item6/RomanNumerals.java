package com.albi.ch2.item6;

import java.util.regex.Pattern;

public class RomanNumerals {
    // Compile the regular expression into a pattern to be reusable (contrary to String.matches("pattern"))
    private static final Pattern ROMAN = Pattern.compile(
            "^(?=.)M(C[MD]|D?C{0,3})"
                    + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$"
    );

    private RomanNumerals() {
        throw new AssertionError();
    }

    static boolean isRomanNumeral(String s) {
        return ROMAN.matcher(s).matches();
    }
}
