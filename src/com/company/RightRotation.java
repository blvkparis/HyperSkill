package com.company;

import java.util.*;

/**
 * A right rotation is an operation which shifts each element of the array to the right.
 * <p>
 * For example, if a right rotation is 1 and array is {1,2,3,4,5}, the new array will be {5,1,2,3,4}.
 * <p>
 * Another example, if a right rotation is 2 and array {1,2,3,4,5}, the new array will be {4,5,1,2,3}, because
 * {1,2,3,4,5} ->  {5,1,2,3,4} ->  {4,5,1,2,3}.
 */
class RightRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");

        int[] newArr = new int[arr.length];
        int rotation = scanner.nextInt() % arr.length;
        for (int i = 0; i < arr.length; i++) {
            newArr[(i + rotation) % arr.length] = Integer.parseInt(arr[i]);
        }

        for (int arg : newArr)
            System.out.print(arg + " ");
    }
}
