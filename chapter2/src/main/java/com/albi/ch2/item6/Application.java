package com.albi.ch2.item6;

// Item 6: Avoid creating unnecessary objects
public class Application {
    public static void main(String[] args) {
        // DON'T DO THIS
        String s = new String("bikini");

        // Ok version
        String reusable = "bikini";

        System.out.println(sum());
    }

    // Autoboxing can impair performance
    private static long sum() {
        Long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++)
            // 2^31 Long instances will be created (crazy!)
            sum += i;
        return sum;
    }
}
