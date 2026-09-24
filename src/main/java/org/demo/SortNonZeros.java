package org.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortNonZeros {

    public static void main(String[] args) {
        int[] arr = {2,1,0,3,4,0,9,2,0};

        // Step 1: Separate non-zeros
        List<Integer> nonZeros = new ArrayList<>();
        int zeroCount = 0;

        for (int num : arr) {
            if (num == 0) {
                zeroCount++;
            } else {
                nonZeros.add(num);
            }
        }

        // Step 2: Sort non-zeros
        Collections.sort(nonZeros);

        // Step 3: Build final array
        int[] result = new int[arr.length];
        int i = 0;
        for (int num : nonZeros) {
            result[i++] = num;
        }
        while (zeroCount-- > 0) {
            result[i++] = 0;
        }

        System.out.println(Arrays.toString(result)); //[1, 2, 2, 3, 4, 9, 0, 0, 0]
    }
}
