package com.company;

import java.util.*;

/** @author - blvkparis
 *
 */
public class Main {
    public static void main(String[] args) {
        //UnOrderedSeq.jobTask1();
        //CollatzConjecture.task();
        //TinkoffTasks.task4();
        //squareNums();
        //moneyInTheBank();
        BusTour.jobTask();
    }

    public static void luckyNumber() {
        Scanner scanner = new Scanner(System.in);
        String strNum = scanner.next();
        int sum1 = 0;
        int sum2 = 0;
        int mid = strNum.length() / 2;
        long num1 = Long.parseLong(strNum.substring(0, mid));
        long num2 = Long.parseLong(strNum.substring(mid));
        for (int i = 0; i < mid + 1; i++) {
            sum1 += num1 % 10;
            num1 /= 10;
        }
        for (int i = strNum.length() - 1; i > mid - 1; i--) {
            sum2 += num2 % 10;
            num2 /= 10;
        }
        if (sum1 == sum2) System.out.println("YES");
        else System.out.println("NO");
    }

    public static void squareNums() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 1;
        while (count != n + 1) {
            for (int i = 0; i < count / 2 + 2; i++)
                if (i * i == count) System.out.println(count);
            count++;
        }
    }

    public static void moneyInTheBank() {
        Scanner scanner = new Scanner(System.in);
        double M = scanner.nextInt();
        double P = scanner.nextInt();
        int K = scanner.nextInt();
        int count = 0;
        while (M < K) {
            M *= (1 + P / 100);
            count++;
        }
        System.out.println(count);
    }
}
