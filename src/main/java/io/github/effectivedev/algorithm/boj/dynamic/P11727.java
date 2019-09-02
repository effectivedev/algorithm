package io.github.effectivedev.algorithm.boj.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 2×n 타일링 2
 * https://www.acmicpc.net/problem/11727
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-09-03 08:24
 */

public class P11727 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] DP = new int[n + 1];
        DP[0] = 1;
        DP[1] = 1;

        for (int i = 2; i <= n; i++) {
            DP[i] = 2 * DP[i - 2] %10007+ DP[i - 1]%10007;
        }
        System.out.println(DP[n]%10007);
    }
}
