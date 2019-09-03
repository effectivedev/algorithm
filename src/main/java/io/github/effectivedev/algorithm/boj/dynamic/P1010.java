package io.github.effectivedev.algorithm.boj.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 다리 놓기
 * https://www.acmicpc.net/problem/1010
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-09-03 10:24
 */

public class P1010 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] DP = new int[31][31];
        for (int i = 1; i <= 30; i++) {
            for (int j = 0; j <= 30; j++) {
                if(i ==j || j==0){
                    DP[i][j] = 1;
                }else{
                    DP[i][j] = DP[i-1][j-1]+ DP[i-1][j];
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            sb.append(DP[m][n]).append("\n");
        }
        br.close();
        System.out.print(sb);
    }
}
