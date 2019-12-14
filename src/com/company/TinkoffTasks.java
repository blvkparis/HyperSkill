package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/** @author - blvkparis
 *
 */
public class TinkoffTasks {
    public static void task4() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        //int[][] list = new int[n][2];
        for (int i = 0; i < n; i++) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
                    ArrayList<String> list = new ArrayList<String>();
                }
            }
        }


    }

    public static void task5() {
        Scanner scanner = new Scanner(System.in);
        String mainString = scanner.next();
        int count = 1;
        for (int i = 0; i < mainString.length() - 1; i++) {
            if (mainString.charAt(i) != 0) {
                String subStr = mainString.substring(i, i + 2);
                if (Integer.parseInt(subStr) >= 10 && Integer.parseInt(subStr) <= 33)
                    count++;
            }
        }
        int factorial = 1;
        for (int i = 1; i <= count; i++) {
            factorial *= i;
        }
        System.out.println(factorial - count);
    }

    public static void task3() {
        Scanner scanner = new Scanner(System.in);

        int A1 = scanner.nextInt();
        int B1 = scanner.nextInt();

        int A2 = scanner.nextInt();
        int B2 = scanner.nextInt();

        if (A1 <= A2 && B1 <= B2 || A1 <= B2 && B1 <= A2) {
            System.out.println("YES");
        } else System.out.println("NO");
    }

    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        String newStr = scanner.nextLine().replaceAll("[^A-Za-z]+", "");
        newStr = newStr.toLowerCase();


        boolean palindromeFlag = false;
        int length = newStr.length();
        int forward = 0;
        int backward = length - 1;
        while (backward > forward) {
            char forwardChar = newStr.charAt(forward++);
            char backwardChar = newStr.charAt(backward--);
            if (forwardChar != backwardChar)
                palindromeFlag = false;
            else palindromeFlag = true;
        }
        if (palindromeFlag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }


    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = i + 1;
        while (x1 < y1) {
            int temp = arr[x1];
            arr[x1] = arr[y1];
            arr[y1] = temp;
            x1 += 1;
            y1 -= 1;
        }
        while (x2 < y2) {
            int temp = arr[x2];
            arr[x2] = arr[y2];
            arr[y2] = temp;
            x2 += 1;
            y2 -= 1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
