package io.github.effectivedev.algorithm.boj.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 최대공약수
 * https://www.acmicpc.net/problem/1850
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 17/09/2019 5:26 오후
 */

public class P1850 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        long gcd = gcd(a, b);
        StringBuilder sb = new StringBuilder();
        for (long i = 0; i < gcd; i++) {
            sb.append("1");
        }
        System.out.println(sb);
    }
    private static long gcd(long a, long b) {
        long temp = 0;
        while (b != 0) {
            temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
