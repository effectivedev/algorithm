package io.github.effectivedev.algorithm.boj.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 포도주 시식
 * https://www.acmicpc.net/problem/2156
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-14 16:53
 */

public class P2156 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int[] arr = new int[T+1];
        int[] DP = new int[T+1];
        for (int i = 1; i <= T; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        DP[1] = arr[1];
        if(T > 1){
            DP[2] = arr[1]+arr[2];
        }
        for (int i = 3; i <= T ; i++) {
            DP[i] = Math.max(Math.max(DP[i-3]+arr[i-1]+arr[i], DP[i-2]+arr[i]),DP[i-1]);
        }
        System.out.println(DP[T]);
    }
}
