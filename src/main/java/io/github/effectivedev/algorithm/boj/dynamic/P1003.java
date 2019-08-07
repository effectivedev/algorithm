package io.github.effectivedev.algorithm.boj.dynamic;

import java.io.*;

/**
 * 피보나치 함수
 * https://www.acmicpc.net/problem/1003
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-07 22:38
 */
public class P1003 {
    private static int[] zero = new int[41];
    private static int[] one = new int[41];

    static {
        zero[0] = 1;
        one[1] = 1;
        for (int i = 2; i < 41; i++) {
            zero[i] = zero[i - 1] + zero[i - 2];
            one[i] = one[i - 1] + one[i - 2];
        }
    }

    public static void main(String args[]) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
            int n = Integer.parseInt(br.readLine());

            StringBuilder sb = new StringBuilder();
            while (n-- > 0) {
                int num = Integer.parseInt(br.readLine());
                sb.append(zero[num]).append(" ").append(one[num]).append("\n");
            }
            bw.write(sb.toString());
        }
    }
}