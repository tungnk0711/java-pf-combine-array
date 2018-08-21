package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] firstArray = new int[2];
        int[] secondArray = new int[3];
        int[] combineArray = new int[5];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < firstArray.length; i++) {
            System.out.println("Enter firstArray[" + (i + 1) + "]:");
            firstArray[i] = input.nextInt();
        }

        for (int i = 0; i < secondArray.length; i++) {
            System.out.println("Enter secondArray[" + (i + 1) + "]:");
            secondArray[i] = input.nextInt();
        }

        for (int i = 0; i < firstArray.length; i++) {
            combineArray[i] = firstArray[i];
        }

        for (int i = 0; i < secondArray.length; i++) {
            combineArray[(firstArray.length + i)] = secondArray[i];
        }

        System.out.print("Combine Array: ");
        for (int i = 0; i < combineArray.length; i++) {
            System.out.print(combineArray[i] + " ");
        }
    }
}
