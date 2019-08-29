package io.github.effectivedev.algorithm.boj.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 동전 0
 * https://www.acmicpc.net/problem/11047
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-29 22:48
 */

public class P11047 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        int index = n-1;

        int cnt = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            int divider = a[i];
            if(k >= divider){
                cnt += k / divider;
                k = k % divider;
            }
            if(k == 0){
                break;
            }
        }
        System.out.println(cnt);
    }
}
