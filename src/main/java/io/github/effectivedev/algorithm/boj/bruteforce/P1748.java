package io.github.effectivedev.algorithm.boj.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 수 이어 쓰기 1
 * https://www.acmicpc.net/problem/1748
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 04/09/2019 5:55 오후
 */

public class P1748 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int d = (int) (Math.log10(n)) + 1;

        long sum = 0;
        if (n < 10) {
            sum = n;
        } else {
            for (int i = 1; i < d; i++) {
                sum += i * (Math.pow(10, i ) -Math.pow(10, i-1));
            }
            sum += d * (n - Math.pow(10, d - 1) + 1);
        }
        System.out.println(sum);

    }
}
