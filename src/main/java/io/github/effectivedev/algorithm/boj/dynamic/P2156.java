package io.github.effectivedev.algorithm.boj.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 포도주 시식
 * https://www.acmicpc.net/problem/2156
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-14 22:31
 */

public class P2156 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[T + 1];
        long[][] DP = new long[T + 1][3];

        for (int i = 1; i <= T; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        /**
         *DP[T][0] : 110 110 110 110...
         *DP[T][1] : 011 011 011 011...
         *DP[T][2] : 101 101 101 101...
         */
        for (int i = 1; i <= T; i++) {
            DP[i][0] = DP[i - 1][0];
            DP[i][1] = DP[i - 1][1];
            DP[i][2] = DP[i - 1][2];
            if (i % 3 != 0) {
                DP[i][0] += arr[i];
            }
            if (i % 3 != 1) {
                DP[i][1] += arr[i];
            }
            if (i % 3 != 2) {
                DP[i][2] += arr[i];
            }
        }
        System.out.println(Math.max(Math.max(DP[T][0], DP[T][1]), DP[T][2]));
    }
}
