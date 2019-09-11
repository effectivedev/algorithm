package io.github.effectivedev.algorithm.boj.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 피보나치 수
 * https://www.acmicpc.net/problem/2747
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 11/09/2019 2:36 오후
 */

public class P2747 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] fibo = new int[N+1];
        fibo[0]= 0;
        fibo[1]= 1;
        for (int i = 2; i <= N; i++) {
            fibo[i] = fibo[i-1]+fibo[i-2];
        }
        System.out.println(fibo[N]);
    }
}
