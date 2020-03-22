package com.albi.ch2.item9;

import java.io.*;

public class CopyFile {
    private static final int BUFFER_SIZE = 8 * 1024;
    private static final String SRC = "chapter2/src/main/resources/src.txt";
    private static final String DEST = "chapter2/src/main/resources/dest.txt";

    public static void main(String[] args) throws IOException {
        copy(SRC, DEST);
    }

    static void copy(String src, String dst) throws IOException {
        try (InputStream in = new FileInputStream(src);
             OutputStream out = new FileOutputStream(dst)) {
            byte[] buf = new byte[BUFFER_SIZE];
            int n;
            while ((n = in.read(buf)) >= 0)
                out.write(buf, 0, n);
        }
    }
}
