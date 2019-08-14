package io.github.effectivedev.algorithm.boj.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1로 만들기
 * https://www.acmicpc.net/problem/1463
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-14 10:55
 */

public class P1463 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] DP = new int[n+1];

        DP[1] = 0;
        for (int i = 2; i <= n; i++) {
            //3. 1을 뺀다.
            DP[i] = DP[i-1]+1;
            if(i % 2 ==0){
                DP[i] = Math.min(DP[i], DP[i/2] +1);
            }
            if(i % 3 ==0){
                DP[i] = Math.min(DP[i], DP[i/3] +1);
            }
        }
        System.out.println(DP[n]);
    }
}
