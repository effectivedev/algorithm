package io.github.effectivedev.algorithm.boj.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 나무 자르기
 * https://www.acmicpc.net/problem/2805
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019/10/08 4:23 PM
 */

public class P2805 {
    static long[] tree;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        tree = new long[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            tree[i] = Integer.parseInt(st.nextToken());
        }
        int lo = 0;
        int hi = 1000000000;
        int mid = (lo + hi) >> 1;
        while (lo <= hi) {
            long sum = 0;
            for (int i = 0; i < N; i++) {
                if (tree[i] > mid) {
                    sum += tree[i] - mid;
                }
            }
            if(sum >= M){
                lo = mid+1;
            }else{
                hi = mid-1;
            }
            mid = (lo+hi)  >> 1;
        }
        System.out.println(mid);

    }
}
