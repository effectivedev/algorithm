package io.github.effectivedev.algorithm.boj.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 가장 긴 증가하는 부분 수열
 * https://www.acmicpc.net/problem/11053
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-20 09:35
 */

public class P11053 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        int[] DP = new int[n + 1];
        DP[1] = 1;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int max = DP[1];
        for (int i = 2; i <= n; i++) {
            DP[i] = 1;
            for (int j = 1; j < i; j++) {
                if (arr[i] > arr[j] && DP[i] <= DP[j]) {
                    DP[i] = DP[j]+1;
                }
            }
            max = Math.max(DP[i], max);
        }
        System.out.println(max);
    }
}
