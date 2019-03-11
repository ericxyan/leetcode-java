package com.ericxyan.leetcode;

public class FictionBook {

    private static int barerMarket(int numOfComics, int cash, int fictionPrice, int comicBookPrice) {
        int result = 0;

        if(numOfComics <= 0) {
            return 0;
        }

        if (cash >= fictionPrice * numOfComics) {
            return numOfComics;
        }

        result  = barerMarket(numOfComics - 1, cash + comicBookPrice, fictionPrice, comicBookPrice);

        return result;
    }

    public static void main(String[] args) {
        int test1 = barerMarket(3, 6, 4, 5);
        System.out.println(test1);
        int test2 = barerMarket(4, 6, 4, 5);
        System.out.println(test2);
        int max = barerMarket(5, 6, 4, 2);
        System.out.println(max);
    }

}
