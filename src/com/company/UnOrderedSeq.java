package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Write a program that reads a sequence of integer numbers and outputs true
 * if the sequence is ordered (in ascending or descending order), otherwise, false.
 * Keep in mind, if a number has the same value as the following number, it does not break the order.
 * <p>
 * The sequence ends with 0. Do not consider this number as a part of the sequence.
 * The sequence always has at least one number (excluding 0).
 */
public class UnOrderedSeq {
    public static void jobTask() {
        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();
        long old;

        boolean rordered = true;
        boolean lordered = true;

        while (true) {
            old = num;
            num = sc.nextLong();

            if (num == 0) {
                break;
            }

            if (rordered && num < old) {
                rordered = false;
                continue;
            }

            if (lordered && num > old) {
                lordered = false;
                continue;
            }

            if (!rordered && !lordered) {
                break;
            }
        }

        System.out.println(lordered || rordered);
    }

    public static void jobTask1() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        List<Integer> a = new ArrayList<>();
        int n = -1;
        while (n != 0) {
            n = scanner.nextInt();
            a.add(n);
        }
        a.remove(new Integer(0));
        List<Integer> b = new ArrayList<>(a);
        List<Integer> reverseB = new ArrayList<>(a);
        Collections.sort(b);
        reverseB.sort(Collections.reverseOrder());
        if (a.equals(b) || a.equals(reverseB))
            flag = true;

        System.out.println(flag);
    }

    static public void method(String... words)
    {
        String[] str1 = new String[words.length];
    }
}
