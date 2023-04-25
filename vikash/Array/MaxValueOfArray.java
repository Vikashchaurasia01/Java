package com.vikash.Array;

public class MaxValueOfArray {
    public static void main(String[] args) {
//        int[] arr = {1,4,65,78,34,2};
//        System.out.println(max(arr));
//    }
//    static int max(int[] arr){
//        int maxVal = arr[0];
//        for(int i = 1; i < arr.length; i++){
//            if (arr[i] > maxVal){
//                maxVal = arr[i];
//            }
//        }
//        return maxVal;


//        Maximum value in Range:
      int[] arr = {1,4,65,78,34,2};
      System.out.println(maxRange(arr , 1 , 2));
    }
    static int maxRange(int[] arr , int start , int end){
        int maxVal = arr[start];
        for(int i = start; i <= end; i++){
            if (arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
