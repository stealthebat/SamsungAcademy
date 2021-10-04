package com.company;

import sun.security.util.ArrayUtil;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // Монеты: 1 5 9 10
        // Надо дать сдачу размером в N единиц
        // Необходимо использовать минимальное количество монет

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] solutions = {{1}, {1, 1}, {1, 1, 1}, {1, 1, 1, 1}, {5} };

    }

    public static int solve(int val) {


        return 0;
    }

    public static int findIndexOfMin(int[] lst) {
        int Min = 100;
        int idx = 0;
        for (int i = 0; i < 4; i++) {
            if (lst[i] < Min) {
                Min = lst[i];
                idx = i;
            }
        }
        return idx;
    }

    public  static int[] Append(int[] lst, int val) {
        int[] res = new int[lst.length+1];
        System.arraycopy(lst, 0, res, 0, lst.length);
        res[res.length-1] = val;
        return res;
    }

}
