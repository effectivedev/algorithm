package io.github.effectivedev.algorithm.boj.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 계단 오르기
 * https://www.acmicpc.net/problem/2579
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-13 13:20
 */

public class P2579 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[T + 1];
        int[] DP = new int[T + 1];
        for (int i = 1; i <= T; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        DP[1] = arr[1];
        DP[2] = arr[1]+arr[2];
        for (int i = 3; i <= T; i++) {
           DP[i] = Math.max(DP[i-3]+arr[i-1], DP[i-2])+arr[i];
        }
        System.out.println(DP[T]);
    }
}
