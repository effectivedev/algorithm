package io.github.effectivedev.algorithm.boj.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 동전 문제
 * https://www.acmicpc.net/problem/1398
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 19/09/2019 3:25 오후
 */

public class P1398 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] DP = new int[100];
        int[] coins = {1, 10, 25};
        DP[0] = 0;
        for (int i = 1; i < 100; i++) {
            DP[i] = 99;
            for (int j = 0; j < 3; j++) {
                if (i - coins[j] > -1) {
                    DP[i] = Math.min(DP[i], DP[i - coins[j]] + 1);
                }
            }
        }
        int cnt = 0;
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            long goal = Long.parseLong(br.readLine());
            cnt = 0;
            while (goal != 0) {
                long result = goal % 100;
                cnt += DP[(int) result];
                goal /= 100;
            }
            sb.append(cnt);
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
