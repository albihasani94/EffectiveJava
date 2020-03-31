package com.albi.ch3.item12;

public final class PhoneNumberToString {
    private final short areaCode, prefix, lineNum;

    public PhoneNumberToString(int areaCode, int prefix, int lineNum) {
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
        if (!(o instanceof PhoneNumberToString))
            return false;
        PhoneNumberToString phoneNumber = (PhoneNumberToString) o;
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
}
