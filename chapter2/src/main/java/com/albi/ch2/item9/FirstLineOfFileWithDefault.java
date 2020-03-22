package com.albi.ch2.item9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FirstLineOfFileWithDefault {

    private static final String PATH = "chapter2/src/main/resources/dest-not-exist.txt";

    public static void main(String[] args) {
        System.out.println(firstLineOfFile(PATH, "I do not exist"));
    }

    static String firstLineOfFile(String path, String defaultVal) {
        try (BufferedReader br = new BufferedReader(
                new FileReader(path)
        )) {
            return br.readLine();
        } catch (IOException e) {
            return defaultVal;
        }
    }
}
