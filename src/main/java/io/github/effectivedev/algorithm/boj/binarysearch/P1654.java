package io.github.effectivedev.algorithm.boj.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 랜선 자르기
 * https://www.acmicpc.net/problem/1654
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 08/10/2019 9:00 AM
 */

public class P1654 {
    static int[] arr;
    static int K;
    static int N;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        K = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        arr = new int[K];
        for (int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(binarySearch(1, Integer.MAX_VALUE));
    }

    private static long binarySearch(long lo, long hi) {
        long mid = (lo + hi) / 2;
        while (lo <= hi) {
            int cnt = 0;
            for (int i = 0; i < arr.length; i++) {
                cnt += arr[i] / mid;
            }
            if (cnt >= N) {
                lo = mid + 1;
            } else if (cnt < N) {
                hi = mid - 1;
            }
            mid = (lo + hi) / 2;
        }
        return mid;
    }
}
