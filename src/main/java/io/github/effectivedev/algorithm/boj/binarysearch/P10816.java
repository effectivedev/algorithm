package io.github.effectivedev.algorithm.boj.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 슷자 카드 2
 * https://www.acmicpc.net/problem/10816
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 07/10/2019 5:23 PM
 */

public class P10816 {
    static int[] arr = new int[20000001];
    static StringBuilder sb = new StringBuilder();

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            arr[Integer.parseInt(st.nextToken()) + 10000000]++;
        }
        int N = Integer.parseInt(br.readLine());
        int[] ans = new int[500001];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            ans[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < N; i++) {
            sb.append(arr[ans[i] + 10000000]).append(" ");
        }
        System.out.print(sb);

    }
}
