package com.ericxyan.leetcode;

public class FictionBook {

    private static int barerMarket(int n, int m, int x, int y) {
        if(n <= 0 || m < x) return 0;

        int max = (int) Math.floor(m / x);

        if(n < max) {
            max = n;
            return max;
        } else {
            int newN = (n - max) - 1;
            int newM = m - max*x + y;
            int nextMax = barerMarket(newN, newM, x, y);
            return max + nextMax;
        }
    }

    public static void main(String[] args) {
        int max = barerMarket(3, 6, 4, 5);
        System.out.println(max);
    }

}
