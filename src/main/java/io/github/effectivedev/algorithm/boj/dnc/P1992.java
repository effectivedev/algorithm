package io.github.effectivedev.algorithm.boj.dnc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 쿼드트리
 * https://www.acmicpc.net/problem/1992
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 01/10/2019 9:36 오전
 */

public class P1992 {
    static int[][] qt;
    static int N;
    static StringBuilder sb = new StringBuilder();

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        qt = new int[N][N];
        for (int i = 0; i < N; i++) {
            String[] data = br.readLine().split("");
            for (int j = 0; j < N; j++) {
                qt[i][j] = Integer.parseInt(data[j]);
            }
        }
        compress(0, 0, N);
        System.out.println(sb);
    }

    private static void compress(int r, int c, int chunk) {
        if (checkValue(r, c, chunk)) {
            sb.append(qt[r][c]);
        } else {
            sb.append("(");
            int half = chunk / 2;
            compress(r, c, half);
            compress(r, c + half, half);
            compress(r + half, c, half);
            compress(r + half, c + half, half);
            sb.append(")");
        }
    }

    private static boolean checkValue(int r, int c, int chunk) {
        int val = qt[r][c];
        for (int i = r; i < r + chunk; i++) {
            for (int j = c; j < c + chunk; j++) {
                if (val != qt[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
