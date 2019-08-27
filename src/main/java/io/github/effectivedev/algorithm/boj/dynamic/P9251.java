package io.github.effectivedev.algorithm.boj.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * LCS
 * https://www.acmicpc.net/problem/9251
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-27 15:05
 */

public class P9251 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        char[] charA = a.toCharArray();
        char[] charB = b.toCharArray();

        int DP[][] = new int[charB.length + 1][charA.length + 1];

        int max = 0;
        for (int i = 1; i <= charB.length; i++) {
            for (int j = 1; j <= charA.length; j++) {
                if (charA[j - 1] == charB[i - 1]) {
                    DP[i][j] = DP[i - 1][j - 1] + 1;
                } else {
                    DP[i][j] = Math.max(DP[i][j - 1], DP[i - 1][j]);
                }
                max = Math.max(max, DP[i][j]);

            }
        }
        System.out.println(max);
    }
}
