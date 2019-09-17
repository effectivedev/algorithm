package io.github.effectivedev.algorithm.boj.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * 피보나치 수 4
 * https://www.acmicpc.net/problem/10826
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 17/09/2019 2:39 오후
 */

public class P10826 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        BigInteger[] fibonacci = new BigInteger[N + 1];

        if (N == 0) {
            System.out.println("0");
        } else if (N == 1) {
            System.out.println("1");
        } else if (N >= 2) {
            fibonacci[0] = new BigInteger("0");
            fibonacci[1] = new BigInteger("1");

            for (int i = 2; i <= N; i++) {
                fibonacci[i] = fibonacci[i - 1].add(fibonacci[i - 2]);
            }
            System.out.println(fibonacci[N]);
        }
    }
}
