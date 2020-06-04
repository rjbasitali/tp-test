package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr;
        if(args.length > 0) {
            arr = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                arr[i] = Integer.parseInt(args[i]);
            }
        } else {
            arr = new int[] {1, 2, 4, 3, 7, 16};
        }
	    arrangeAndSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i + 1 == arr.length ? "" : ", "));
        }
    }

    public static void arrangeAndSort(int[] arr) {
        int leftIndex = 0, rightIndex = arr.length - 1, countOfOdds = 0;

        while(leftIndex < rightIndex) {

            while (arr[leftIndex] % 2 != 0) {
                leftIndex++;
                countOfOdds++;
            }

            while (arr[rightIndex] % 2 == 0 && leftIndex < rightIndex)
                rightIndex--;

            // swap odd number to left and even to right
            if (leftIndex < rightIndex) {
                int temp = arr[leftIndex];
                arr[leftIndex] = arr[rightIndex];
                arr[rightIndex] = temp;
            }

        }

        // sort odd and even subsets
        Arrays.sort(arr, 0, countOfOdds);
        Arrays.sort(arr, countOfOdds, arr.length);
    }
}
