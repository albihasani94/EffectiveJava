package com.albi.ch6.item35;

public class Application {
    public static void main(String[] args) {
        // Not nice - aka hell
        System.out.println(Ensemble.QUINTET.ordinal());
        System.out.println(Ensemble.QUINTET.getNumberOfMusicians());
        System.out.println(Ensemble.QUINTET);
        System.out.println(Ensemble.valueOf("QUINTET"));
    }
}
