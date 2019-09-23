package io.github.effectivedev.algorithm.boj.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 숫자 정사각형
 * https://www.acmicpc.net/problem/1051
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 23/09/2019 9:22 오전
 */

public class P1051 {
    static int[][] arr = new int[50][50];
    static int N;
    static int M;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            String data = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = data.charAt(j) - '0';
            }
        }
        int max = -1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                max = Math.max(max, getMax(i, j));
            }
        }
        System.out.println(max);
    }

    private static int getMax(int i, int j) {
        int maxLength = Math.min(N, M);
        int num = arr[i][j];
        int max = 0;
        for (int k = 0; k < maxLength; k++) {
            if (i + k < N && j + k < M)
                if ((num == arr[i][j + k]) && (num == arr[i + k][j]) && (num == arr[i + k][j + k])) {
                    max = Math.max(max, (k + 1) * (k + 1));
                }
        }
        return max;
    }
}
