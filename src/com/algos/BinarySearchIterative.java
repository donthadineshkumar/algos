package com.algos;

/*
arr[] = {2, 3, 6, 10, 50}
K=10
present

--

arr[] = {2, 3, 6, 10, 50}
K=100
present

 */
public class BinarySearchIterative {

    public static void main(String[] args) {
        int arr[] = {2, 3, 6, 8, 10, 50, 70};
        int k=3;
        int searchedElement = binarySearch(arr, k);
        System.out.println(searchedElement);
    }

    private static int binarySearch(int[] arr, int targetElement) {
        int l = 0;
        int r = arr.length-1;

        while(l<=r){
            int m = (l + r)/2;
            if(arr[m] == targetElement) {
                return m;
            }
            if(arr[m] < targetElement) {
                l = m + 1;
            }
            if(arr[m] > targetElement) {
                r = m - 1;
            }
        }
        return -1;
    }

}
