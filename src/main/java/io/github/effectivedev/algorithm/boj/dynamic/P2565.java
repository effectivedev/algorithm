package io.github.effectivedev.algorithm.boj.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 전깃줄
 * https://www.acmicpc.net/problem/2565
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-26 13:34
 */

public class P2565 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int line[] = new int[501];
        StringTokenizer st = null;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            line[Integer.parseInt(st.nextToken())] = Integer.parseInt(st.nextToken());
        }
        int arr[] = new int[N + 1];
        int k = 1;
        for (int i = 1; i <= 500; i++) {
            if (line[i] != 0) {
                arr[k++] = line[i];
            }
        }
        int[] DP = new int[N + 1];
        DP[1] = 1;
        int max = DP[1];
        for (int i = 2; i <= N; i++) {
            DP[i] = 1;
            for (int j = 1; j < i; j++) {
                if (arr[i] > arr[j] && DP[i] <= DP[j]) {
                    DP[i] = DP[j]+1;
                }
            }
            max = Math.max(DP[i], max);
        }
        System.out.println(N-max);
    }
}
