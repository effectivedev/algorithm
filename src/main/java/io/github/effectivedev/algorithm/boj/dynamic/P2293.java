package io.github.effectivedev.algorithm.boj.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 동전 1
 * https://www.acmicpc.net/problem/2293
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-09-03 17:56
 */

public class P2293 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] coins = new int[N+1];
        int[] DP = new int[K+1];
        for (int i = 1; i <= N; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }
        DP[0] = 1;
        for (int i = 1; i <= N ; i++) {
            for (int j = 1; j <= K; j++) {
                if(j >= coins[i]){
                    DP[j] += DP[j-coins[i]];
                }
            }
        }
        System.out.printf("%d\n", DP[K]);
    }
}
