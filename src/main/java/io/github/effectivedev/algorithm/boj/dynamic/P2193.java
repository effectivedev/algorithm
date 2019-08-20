package io.github.effectivedev.algorithm.boj.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 이친수
 * https://www.acmicpc.net/problem/2193
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-21 00:08
 */

public class P2193 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        //DP[n] :  n자리 이친수의 개수  01으로 끝나는 케이스 : DP[n-2]  0으로 끝나는 케이스 DP[n-1]
        long[]DP = new long[T+1];

        DP[1] = 1;
        if(T > 1){
            DP[2] = 1;
        }
        for (int i = 3; i <= T; i++) {
            DP[i] = DP[i-1] + DP[i-2];
        }
        System.out.println(DP[T]);
    }
}
