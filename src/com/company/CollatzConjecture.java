package com.company;

import java.util.Scanner;

/** @author - blvkparis
 *
 */
public class CollatzConjecture {
    public static void task() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print(n + " ");
        while (n != 1) {
            if (n % 2 == 0) n /= 2;
            else n = 3 * n + 1;
            System.out.print(n + " ");
        }
    }
}
