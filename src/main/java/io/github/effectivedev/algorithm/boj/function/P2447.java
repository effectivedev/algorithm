package io.github.effectivedev.algorithm.boj.function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 별 찍기 - 10
 * https://www.acmicpc.net/problem/2447
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-09 16:33
 */

public class P2447 {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        int star[][] = new int[2187][2187];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    star[i][j] = 0;
                } else {
                    star[i][j] = 1;
                }
            }
        }
        for (int i = 1; i < 7; i++) {
            copyFacade(star, (int) Math.pow(3, i));
        }
        printStar(star, n);
    }
    private static void copyFacade(int[][] arr, int size) {
        inArrayCopy(arr, size, 0, size);
        inArrayCopy(arr, size, size * 2, size);
        inArrayCopy(arr, 0, size, size);
        inArrayCopy(arr, 0, size * 2, size);
        inArrayCopy(arr, size * 2, 0, size);
        inArrayCopy(arr, size * 2, size, size);
        inArrayCopy(arr, size * 2, size * 2, size);

    }
    private static void inArrayCopy(int[][] arr, int m, int n, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i + m][j + n] = arr[i][j];
            }
        }
    }

    private static void printStar(int[][] starArr, int size) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (starArr[i][j] == 1) {
                    sb.append("*");
                } else {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
