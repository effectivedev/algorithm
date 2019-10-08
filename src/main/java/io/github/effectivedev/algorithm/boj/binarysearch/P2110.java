package io.github.effectivedev.algorithm.boj.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 공유기 설치
 * https://www.acmicpc.net/problem/2110
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019/10/08 4:40 PM
 */

public class P2110 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int[] points = new int[N];
        for (int i = 0; i < N; i++) {
            points[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(points);

        int left = 1;
        int right = points[N - 1] - points[0];
        int d = 0;
        int ans = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            int start = points[0];
            int cnt = 1;
            for (int i = 1; i < N; i++) {
                d = points[i] - start;
                if (mid <= d) {
                    ++cnt;
                    start = points[i];
                }
            }
            if (cnt >= C) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(ans);
    }
}
