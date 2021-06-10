package com.algos;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "I am in love with her";
        System.out.println("Reverse of a sentence: " + reverseSentence(sentence));
        System.out.println(sentence.length() == reverseSentence(sentence).length());
        //2nd way
        //By using apache-commons:commons-lang3 dependency
        //StringUtils.reverseDelimited(str)
    }

    private static String reverseSentence(String sentence) {
        if (sentence == null) return null;
        String[] words = sentence.split(" ");
        StringBuilder output = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            output.append(words[i]);
            output.append(" ");
        }
        return output.toString().trim();
    }
}
