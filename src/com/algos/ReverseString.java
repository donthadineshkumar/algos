package com.algos;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("1st Way : Reverse of given string : " + reverseStr(str));
        System.out.println("2nd Way : Reverse of given string : " + reverseStr2(str));
        //Using 3rd way
        //By using apache-commons:commons-lang3
        //StringUtils.reverse(str)
    }

    private static String reverseStr2(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder builder = new StringBuilder(str).reverse();
        return builder.toString();
    }

    private static String reverseStr(String str) {
        if (str == null) {
            return null;
        }
        char[] in = str.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = in.length - 1; i >= 0; i--) {
            builder.append(in[i]);
        }
        return builder.toString();
    }
}
