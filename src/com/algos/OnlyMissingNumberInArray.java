package com.algos;

public class OnlyMissingNumberInArray {

    public static void main(String[] args) {
        int[] arr= {1, 3};
        //The missing number from 1 to 3 is 2
        System.out.println("The missing number "+ findMissingNumber(arr));
    }

    private static int findMissingNumber(int[] arr) {
        //Calculate sum of numbers from 1 to 3 using n(n+1)/2
        int n = arr.length + 1;
        int sumOf = n * (n + 1)/2;
        int sum = 0;
        for(int i : arr) {
            sum = sum + i; //moving sum
        }
        return sumOf - sum; //missing number 2
    }
}
