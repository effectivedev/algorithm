package io.github.effectivedev.algorithm.boj.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 계단 오르기
 * https://www.acmicpc.net/problem/2579
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-13 13:20
 */

public class P2579 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[T+1];
        int[][] DP = new int[T+1][3];
        for (int i = 0; i < T ; i++) {
            arr[i+1] = Integer.parseInt(br.readLine());
        }
        //DP[POSITION, CNT]
        DP[0][2] = arr[2];
        DP[0][1] = arr[1];
        //2로 끝난 경우
        for (int i = T; i >=2 ; i--) {
            DP[i][2] = Math.max(DP[i-2][2] , DP[i-1][1])+ (arr[i-1]+arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(DP[i][2]);
            System.out.println(DP[i][1]);
        }
    }
}
