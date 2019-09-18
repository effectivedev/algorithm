package io.github.effectivedev.algorithm.boj.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 부등호
 * https://www.acmicpc.net/problem/2529
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-09-02 14:13
 */

public class P2529 {
    static boolean[] visited = new boolean[10];
    static String[] sign;
    static boolean getMax = false;
    static boolean getMin = false;

    static int N;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        sign = br.readLine().split(" ");

        getMax("", 0);
        getMin("", 0);
    }
    private static void getMax(String num, int length) {
        if(getMax){
            return;
        }
        if (length == N + 1) {
            getMax = true;
            System.out.println(num);
            return;
        } else {
            for (int i = 9; i >= 0; i--) {
                if (visited[i]) {
                    continue;
                }
                if (length == 0 || check(num.charAt(length - 1) - '0', i, sign[length - 1].charAt(0))) {
                    visited[i] = true;
                    getMax(num + i, length + 1);
                    visited[i] = false;
                }
            }
        }
    }
    private static void getMin(String num, int length) {
        if(getMin){
            return;
        }
        if (length == N + 1) {
            getMin = true;
            System.out.println(num);
            return;
        } else {
            for (int i = 0; i < 10; i++) {
                if (visited[i]) {
                    continue;
                }
                if (length == 0 || check(num.charAt(length - 1) - '0', i, sign[length - 1].charAt(0))) {
                    visited[i] = true;
                    getMin(num + i, length + 1);
                    visited[i] = false;
                }
            }
        }
    }
    private static boolean check(int a, int b, char sign) {
        if (sign == '>') {
            return a > b;
        } else if (sign == '<') {
            return a < b;
        }
        return true;
    }
}
