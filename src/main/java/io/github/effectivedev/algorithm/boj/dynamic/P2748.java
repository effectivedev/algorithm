package io.github.effectivedev.algorithm.boj.dynamic;

import java.io.*;
import java.math.BigDecimal;

/**
 * 피보나치 수 2
 * https://www.acmicpc.net/problem/2748
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-08 02:18
 */
public class P2748 {
    static long[] fibo = new long[50];
    static{
        fibo[1] = 1;
    }
    public static void main(String args[]) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            int n = Integer.parseInt(br.readLine());
            for (int i = 2; i <= n; i++) {
                fibo[i] = fibo[i - 1] + fibo[i - 2];
            }
            System.out.println(fibo[n]);
        }
    }
}