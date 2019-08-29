package io.github.effectivedev.algorithm.boj.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * ATM
 * https://www.acmicpc.net/problem/11399
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-29 21:53
 */

public class P11399 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0 ; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int [] f = new int[n];

        f[0] = arr[0];
        for (int i = 1; i < n; i++) {
            f[i] =f[i-1] + arr[i];
        }
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += f[i];
        }
        System.out.println(total);
    }
}
