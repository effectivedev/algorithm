package io.github.effectivedev.algorithm.boj.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 스티커
 * https://www.acmicpc.net/problem/9465
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 20/09/2019 4:31 오후
 */

public class P9465 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] arr = null;
        int[][] DP = null;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int cnt = Integer.parseInt(br.readLine());
            arr = new int[2][cnt];
            DP = new int[2][cnt];
            for (int m = 0; m < 2; m++) {
                st = new StringTokenizer(br.readLine());
                for (int n = 0; n < cnt; n++) {
                    arr[m][n] = Integer.parseInt(st.nextToken());
                }
            }
            DP[0][0] = arr[0][0];
            DP[1][0] = arr[1][0];
            for (int j = 1; j < cnt; j++) {
                if (j == 1) {
                    DP[0][j] = DP[1][j - 1] + arr[0][j];
                    DP[1][j] = DP[0][j - 1] + arr[1][j];
                } else {
                    DP[0][j] = Math.max(DP[1][j - 1], DP[1][j - 2]) + arr[0][j];
                    DP[1][j] = Math.max(DP[0][j - 1], DP[0][j - 2]) + arr[1][j];
                }
            }
            sb.append(Math.max(DP[0][cnt-1], DP[1][cnt-1]));
            sb.append("\n");

        }
        System.out.print(sb);
    }
}
