package com.vikash.Array;

import java.util.Arrays;

public class PassingInFunction {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(nums));
        changeNum(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void changeNum(int[] arr) {
        arr[0] = 99;
    }
}
