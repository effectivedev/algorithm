package io.github.effectivedev.algorithm.boj.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 링
 * https://www.acmicpc.net/problem/3036
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 09/09/2019 2:08 오후
 */

public class P3036 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < N; i++) {
            int n = arr[0];
            int value = arr[i];
            int gcd = getGCD(value, n);
            sb.append(n/gcd);
            sb.append("/");
            sb.append(value/gcd);
            sb.append("\n");
        }
        System.out.print(sb);
    }
    private static int getGCD(int a, int b){
        while(a % b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        return b;
    }
}
