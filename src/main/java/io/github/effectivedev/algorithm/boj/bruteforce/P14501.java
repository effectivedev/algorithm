package io.github.effectivedev.algorithm.boj.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 퇴사
 * https://www.acmicpc.net/problem/14501
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-26 09:19
 */

public class P14501 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] t = new Integer[n + 1];
        Integer[] p = new Integer[n + 1];
        int[] dp = new int[n + 2];
        StringTokenizer st = null;
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            t[i] = Integer.parseInt(st.nextToken());
            p[i] = Integer.parseInt(st.nextToken());
        }
        //dp[n] :n번째부터 최대수익의 합
        for (int i = n; i > 0; i--) {
            int pos = i + t[i];
            if(pos <= n+1){
                dp[i] = Math.max(p[i]+dp[pos], dp[i+1]);
            }else{
                dp[i] = dp[i+1];
            }
        }
        System.out.println(dp[1]);
    }

}
