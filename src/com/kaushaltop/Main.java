package com.kaushaltop;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myArray = getIntegers(5);

        int[] sorted = sortedArray(myArray);

        printArray(sorted);

    }

    public static int[] getIntegers(int number) {

        int[] values = new int[number];

        System.out.println("Enter "+number+" integer values: \r");

        for (int i=0; i<values.length; i++) {

            values[i] = scanner.nextInt();

        }

        return values;
    }

    public static void printArray(int[] array) {

        for (int i=0; i<array.length; i++) {

            System.out.println("Element at "+i+" = "+array[i]);

        }

    }

    public static int[] sortedArray(int[] array) {

        int[] sortedArray = new int[array.length];

        for (int i=0; i<array.length; i++) {

            sortedArray[i] = array[i];

        }

        boolean flag = true;
        int temp;

        while (flag) {

            flag = false;
            for (int i=0; i<sortedArray.length-1; i++) {

                //get 1st number compare with next number if less then,
                if (sortedArray[i] < sortedArray[i+1]) {

                    //store the 1st number in temp
                    temp = sortedArray[i];

                    //then at the 1st place store the 2nd place number
                    sortedArray[i] = sortedArray[i+1];

                    //then at 2nd place store the variable placed in temp
                    sortedArray[i+1] = temp;

                    //hence two numbers are replaced, keep doing it until all numbers are sorted
                    //therefore, flag = true
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
