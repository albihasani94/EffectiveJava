package com.albi.ch3.item14;

import java.util.Comparator;

public final class PhoneNumber implements Comparable<PhoneNumber> {
    private final short areaCode, prefix, lineNum;

    public PhoneNumber(int areaCode, int prefix, int lineNum) {
        this.areaCode = rangeCheck(areaCode, 999, "area code");
        this.prefix = rangeCheck(prefix, 999, "prefix");
        this.lineNum = rangeCheck(lineNum, 9999, "line num");
    }

    private static short rangeCheck(int val, int max, String arg) {
        if (val < 0 || val > max)
            throw new IllegalArgumentException(arg + ": " + val);
        return (short) val;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof PhoneNumber))
            return false;
        PhoneNumber phoneNumber = (PhoneNumber) o;
        return phoneNumber.areaCode == areaCode && phoneNumber.prefix == prefix && phoneNumber.lineNum == lineNum;
    }

    @Override
    public int hashCode() {
        int result = Short.hashCode(areaCode);
        result = 31 * result + Short.hashCode(prefix);
        result = 31 * result + Short.hashCode(lineNum);
        return result;

    }

    /**
     * I'm too lazy to write a proper description on the format of this output
     */
    @Override
    public String toString() {
        return String.format("%03d-%03d-%04d", areaCode, prefix, lineNum);
    }

    public short getAreaCode() {
        return areaCode;
    }

    public short getPrefix() {
        return prefix;
    }

    public short getLineNum() {
        return lineNum;
    }

    // Multiple field Comparable with primitive fields
    @Override
    public int compareTo(PhoneNumber ph) {
        int result = Short.compare(areaCode, ph.areaCode);
        if (result == 0) {
            result = Short.compare(prefix, ph.prefix);
            if (result == 0)
                result = Short.compare(lineNum, ph.lineNum);
        }
        return result;
    }

    // Comparable with comparator construction methods
    public static final Comparator<PhoneNumber> COMPARATOR =
            Comparator.comparingInt(PhoneNumber::getAreaCode)
            .thenComparingInt(PhoneNumber::getPrefix)
            .thenComparingInt(PhoneNumber::getLineNum);

    /*public int compareTo(PhoneNumber pn) {
        return COMPARATOR.compare(this, pn);
    }*/
}