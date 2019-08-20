package io.github.effectivedev.algorithm.boj.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 가장 긴 바이토닉 부분 수열
 * https://www.acmicpc.net/problem/11054
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-20 21:50
 */

public class P11054 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[T + 1];
        int[][] d = new int[T + 1][3];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= T; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        //변수 초기화
        for (int i = 1; i <= T; i++) {
            for (int j = 0; j < 2; j++) {
                d[i][j] = 1;
            }
        }
        int max = 0;
        for (int i = 2; i <= T; i++) {
            int pivot = arr[i];
            for (int j = 1; j < i; j++) {
                if (pivot > arr[j] && d[i][0] <= d[j][0]) {
                    d[i][0] = d[j][0] + 1;
                } else if (pivot == arr[j]) {
                    d[i][0] = d[j][0];
                }
            }
        }
        for (int i = T - 1; i >= 1; i--) {
            int pivot = arr[i];
            for (int j = T; j > i; j--) {
                if (pivot > arr[j] && d[i][1] <= d[j][1]) {
                    d[i][1] = d[j][1] + 1;
                } else if (pivot == arr[j]) {
                    d[i][1] = d[j][1];
                }
            }

        }
        for (int i = 1; i <= T; i++) {
            max = Math.max(d[i][0] + d[i][1] - 1, max);
        }
        System.out.println(max);
    }
}
