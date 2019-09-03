package io.github.effectivedev.algorithm.boj.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 카드구매하기
 * https://www.acmicpc.net/problem/11052
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-09-03 09:21
 */

public class P11052 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int index = 1;
        int[] arr = new int[n+1];
        while(st.hasMoreTokens()){
            arr[index++] = Integer.parseInt(st.nextToken());
        }
        //n개 샀을 때 최대값
        int[] DP = new int[n+1];
        DP[1] = arr[1];
        for (int i = 2; i <= n; i++) {
            int max = 0;
            for (int j = 1; j < i; j++) {
                int val = DP[j] + DP[i - j];
                if(max < val){
                    max = val;
                }
            }
            DP[i] = Math.max(max, arr[i]);
        }
        System.out.println(DP[n]);
    }
}
