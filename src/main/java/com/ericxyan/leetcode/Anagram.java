package com.ericxyan.leetcode;

import java.util.Scanner;

public class Anagram {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTest = Integer.parseInt(scanner.nextLine());
        System.out.println("numTest: " + numTest);
        while(numTest-- > 0) {
            int strLen = Integer.parseInt(scanner.nextLine());
            System.out.println("strLen: " + strLen);
            String words = scanner.nextLine();
            String[] strPair = words.split(" ");
            System.out.println("strPair: " + words);
            String word1 = strPair[0];
            String word2 = strPair[1];

            int numDiff = 0;
            for(char w: word1.toCharArray()) {
                int idx = word2.indexOf(w);
                if(idx == -1) {
                    numDiff++;
                }
                word2 = word2.replaceFirst(String.valueOf(w), "");
            }

            System.out.println(numDiff);
        }
    }
}
