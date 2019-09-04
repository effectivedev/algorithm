package io.github.effectivedev.algorithm.boj.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
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
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int arr[] = new int[n+1];
        for (int i = 1; i <=n ; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int DP[] = new int[k+1];
        DP[1] = 1;
        DP[2] = 2;
        DP[3] = DP[1]+DP[2]- DP[2];


    }
}
