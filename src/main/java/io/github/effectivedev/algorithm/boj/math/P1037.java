package io.github.effectivedev.algorithm.boj.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 약수
 * https://www.acmicpc.net/problem/1037
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 09/09/2019 8:41 오전
 */

public class P1037 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] data = new int[N];
        for (int i = 0; i < N; i++) {
            data[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(data);
        if (N == 1) {
            int a = data[0];
            System.out.println(a * a);
        } else {
            System.out.println(data[0] * data[data.length - 1]);
        }
    }
}
