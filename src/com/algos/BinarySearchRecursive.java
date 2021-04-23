package com.algos;

public class BinarySearchRecursive {

    public static void main(String[] args) {
        int arr[] = {2, 3, 6, 8, 10, 50, 70};
        int k = 10;
        int searchedElement = binarySearchRecursive(arr, 0, arr.length - 1, k);
        System.out.format("The searched element is at position %d", searchedElement);
    }

    private static int binarySearchRecursive(int[] arr, int l, int r, int k) {
        if (r >= l) {
            int m = (l + r) / 2;
            if (arr[m] == k) {
                return m;
            }
            if (arr[m] > k) {
                return binarySearchRecursive(arr, l, m - 1, k);
            }
            return binarySearchRecursive(arr, m + 1, r, k);
        }
        return -1;
    }

}
