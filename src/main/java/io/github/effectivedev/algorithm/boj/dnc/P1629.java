package io.github.effectivedev.algorithm.boj.dnc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 곱셈
 * https://www.acmicpc.net/problem/1629
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 30/09/2019 4:26 오후
 */

public class P1629 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());
        System.out.println(pow(A, B, C) % C);
    }

    private static long pow(long A, long B, long c) {
        if (B == 1) {
            return A;
        } else {
            long half = pow(A, B / 2, c);
            long result = half % c * half % c;
            if (B % 2 == 1) {
                return (result % c * (A % c)) % c;
            } else {
                return result % c;
            }
        }
    }
}
