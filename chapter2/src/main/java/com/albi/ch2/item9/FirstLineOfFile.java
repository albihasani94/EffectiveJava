package com.albi.ch2.item9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FirstLineOfFile {

    private static final String PATH = "chapter2/src/main/resources/src.txt";

    public static void main(String[] args) throws IOException {
        System.out.println(firstLineOfFile(PATH));
    }

    static String firstLineOfFile(String path) throws IOException {
        try (BufferedReader br = new BufferedReader(
                new FileReader(path))) {
            return br.readLine();
        }
    }
}
