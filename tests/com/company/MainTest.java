package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {

    @Test
    void arrangeAndSort() {
        int[] arr = {11, 5, 17, 19, 9, 0, 16, 1, 15, 6, 10, 13, 14, 12, 7, 3, 8, 2, 18, 4};
        Main.arrangeAndSort(arr);
        int firstEvenIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                firstEvenIndex = i;
                break;
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if(firstEvenIndex != 0 && i + 1 == firstEvenIndex) continue; // skip for odd to even transition
            assertTrue(arr[i] < arr[i + 1]                      // current number should be less than next one
                    && (arr[i] + arr[i + 1]) % 2 == 0                    // both number should be evens or odds
                    && (arr[i] % 2 == 0 ? arr[i + 1] % 2 == 0 : true));  // even number cannot be followed by odd
        }
    }
}