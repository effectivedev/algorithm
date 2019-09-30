package io.github.effectivedev.algorithm.boj.dnc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 행렬 제곱
 * https://www.acmicpc.net/problem/10830
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 30/09/2019 2:40 오후
 */

public class P10830 {
    static int N;
    static long B;
    static int[][] M;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        B = Long.parseLong(st.nextToken());

        M = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                M[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        StringBuilder sb = new StringBuilder();
        int result[][] = pow(M, B);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(result[i][j] % 1000);
                sb.append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);

    }

    private static int[][] pow(int[][] A, long B) {
        if (B == 1)
            return A;
        int[][] result = pow(A, B / 2); //half
        result = getMatrixMultiply(result, result);
        if (B % 2 == 1) {
            result = getMatrixMultiply(result, A);
        }
        return result;
    }

    private static int[][] getMatrixMultiply(int[][] A, int[][] B) {
        int matrix[][] = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    matrix[i][j] += A[i][k] % 1000 * B[k][j] % 1000;
                }
            }
        }
        return matrix;
    }
}
