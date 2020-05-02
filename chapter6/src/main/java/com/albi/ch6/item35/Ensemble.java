package com.albi.ch6.item35;

public enum Ensemble {
    SOLO(1), DUET(2), TRIO(3), QUARTET(4), QUINTET(5),
    SEXTET(6), SEPTET(7), OCTET(8);

    private final int numberOfMusicians;

    Ensemble(int size) {
        this.numberOfMusicians = size;
    }

    public int getNumberOfMusicians() {
        return numberOfMusicians;
    }
}
