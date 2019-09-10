package io.github.effectivedev.algorithm.boj.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 1학년
 * https://www.acmicpc.net/problem/5557
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 09/09/2019 5:27 오후
 */

public class P5557 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        long[][] DP = new long[N+1][21]; //DP[i][n]은 i번째 합이 n인 갯수
        DP[1][arr[0]]++; //첫번째 합이 arr[0]인 것의 갯수

        for (int i = 2; i < N ; i++) {
            int num = arr[i-1];
            for (int j = 0; j < 21; j++) {
                if(DP[i-1][j] > 0){
                    if(j + num  <= 20){
                        DP[i][j+num] += DP[i-1][j];
                    }
                    if(j - num  >= 0){
                        DP[i][j-num] += DP[i-1][j];
                    }
                }
            }
        }
        System.out.println(DP[N-1][arr[N-1]]);
    }
}