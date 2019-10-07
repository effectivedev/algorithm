package io.github.effectivedev.algorithm.boj.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 수 찾기
 * https://www.acmicpc.net/problem/1920
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 07/10/2019 9:26 AM
 */

public class P1920 {
    static int[] A;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] B = new int[M];
        for (int i = 0; i < M; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            if (-1 != binarySearch(0, A.length - 1, B[i])) {
                sb.append("1");
            } else {
                sb.append("0");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }

    private static int binarySearch(int start, int end, int num) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        int midVal = A[mid];
        if (midVal == num) {
            return mid;
        } else if (num < midVal) {
            return binarySearch(start, mid - 1, num);
        } else {
            return binarySearch(mid + 1, end, num);
        }
    }
}