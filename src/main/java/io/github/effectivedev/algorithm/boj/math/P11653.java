package io.github.effectivedev.algorithm.boj.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 소인수분해
 * https://www.acmicpc.net/problem/11653
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 09/09/2019 8:55 오전
 */

public class P11653 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= N; i++) {
            if(N % i == 0){
                N = N/i;
                sb.append(i).append("\n");
                i = 1;
            }
        }
        System.out.print(sb);
    }
}
