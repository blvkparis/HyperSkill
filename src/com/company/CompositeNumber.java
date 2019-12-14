package com.company;

public class CompositeNumber {
    public static boolean isComposite(long number) {
        for (int i = 2; i < (int) Math.sqrt(number) + 1; i++) {
            if (number % i == 0) {
                return true;
            }
        }

        return false;
    }
}
