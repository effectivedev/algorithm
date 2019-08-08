package io.github.effectivedev.algorithm.boj.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * RGB거리
 * https://www.acmicpc.net/problem/1149
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-08 10:28
 */
public class P1149 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        int[][] cost = new int[cnt][3];
        for (int i = 0; i < cnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine().toString(), " ");
            cost[i][0] = Integer.parseInt(st.nextToken());
            cost[i][1] = Integer.parseInt(st.nextToken());
            cost[i][2] = Integer.parseInt(st.nextToken());
        }
        int[][] DP = new int[cnt][3];
        DP[0][0] = cost[0][0];
        DP[0][1] = cost[0][1];
        DP[0][2] = cost[0][2];
        for (int i=1; i< cnt; i++){
            DP[i][0] = Math.min(DP[i-1][1], DP[i-1][2]) + cost[i][0]; //R로 종료
            DP[i][1] = Math.min(DP[i-1][2], DP[i-1][0]) + cost[i][1]; //G로 종료
            DP[i][2] = Math.min(DP[i-1][0], DP[i-1][1]) + cost[i][2]; //B로 종료
        }
        System.out.println(Math.min(Math.min(DP[cnt - 1][0], DP[cnt - 1][1]), DP[cnt-1][2]));
    }
}
