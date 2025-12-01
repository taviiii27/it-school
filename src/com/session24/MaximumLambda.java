package com.session24;

import java.util.Arrays;
import java.util.List;

public class MaximumLambda {
    public static void main(String[] args) {
        MaximumInterf maxFinder = list -> {
            if (list == null || list.isEmpty()) return null;
            return list.stream().max(Integer::compareTo).orElse(null);
        };

        List<Integer> nums = Arrays.asList(3, 9, 2, 14, 7);
        System.out.println("Max = " + maxFinder.findMax(nums));
    }

}

