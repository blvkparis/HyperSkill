package com.company;


import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * A bus tour of Europe has been very successful. Due to an increase in the number of people that want to go
 * on a tour, the tour company decided to increase the height of the bus. The new height of the bus
 * is exactly N centimeters.
 * <p>
 * But the tour’s route runs under a lot of bridges, and there is a chance that the bus will crash
 * into one of these bridges. Can you find out if this will happen?
 * <p>
 * The first line of the input contains the height of the bus and number of bridges under which the bus passes.
 * The second line contains heights of these bridges.
 * <p>
 * You should output "Will not crash" if everything will be all right;
 * otherwise, output "Will crash on bridge i" (where i is a number of a bridge) into which the bus will crash.
 * If the height of a bridge equals the height of the bus, the bus will crash.
 *
 * @Input1 234 8
 * 465 453 981 463 1235 871 475 981
 * @Output1 Will not crash
 * @Input2 211 5
 * 871 205 123 871 1681
 * @Output2 Will crash on bridge 2
 */
public class BusTour {
    public static void jobTask() {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int n = scanner.nextInt();

        int[] bridges = new int[n];
        for (int i = 0; i < n; i++) {
            bridges[i] = scanner.nextInt();
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (height < bridges[i])
                count++;
            else {
                System.out.println("Will crash on bridge " + (int) (count + 1));
                break;
            }
        }
        if (n == count) System.out.println("Will not crash");
    }
}
