package io.github.effectivedev.algorithm.boj.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 연속합
 * https://www.acmicpc.net/problem/1912
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-21 00:44
 */

public class P1912 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[100000];
        //n번째 까지의 연속합 중 최대값
        int[] DP = new int[100000];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        DP[0] = arr[0];
        int max =DP[0];
        for (int i = 1; i < n; i++) {
            DP[i] = Math.max(DP[i-1], 0)+arr[i];
            max =Math.max(max, DP[i]);
        }
        System.out.println(max);
    }
}

