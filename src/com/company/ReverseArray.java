package com.company;

public class ReverseArray {
    public static int[] reverseArray(int[] a) {
        int[] b = new int[a.length];
        int j = 0;
        for (int i = a.length - 1; i > -1; i--) {
            b[j] = a[i];
            j++;
        }
        return b;
    }
}
