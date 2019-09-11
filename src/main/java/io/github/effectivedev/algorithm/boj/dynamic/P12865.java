package io.github.effectivedev.algorithm.boj.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 평범한 배낭
 * https://www.acmicpc.net/problem/12865
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 11/09/2019 11:07 오전
 */

public class P12865 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] w = new int[101];
        int[] v = new int[101];
        int[] DP = new int[100001];

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            w[i] = Integer.parseInt(st.nextToken());
            v[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 1; i <= N; i++) {
            int weight = w[i];
            int value = v[i];
            for (int j = K; j - weight >=0; j--) {
                DP[j] = Math.max(DP[j], DP[j- weight]+ value);
            }
        }
        System.out.println(DP[K]);
    }
}
