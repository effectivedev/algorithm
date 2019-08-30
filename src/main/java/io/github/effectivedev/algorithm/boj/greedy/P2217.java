package io.github.effectivedev.algorithm.boj.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/**
 * 로프
 * https://www.acmicpc.net/problem/2217
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-30 09:43
 */

public class P2217 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        Arrays.sort(arr);
        int max = 0;
        for (int i = n-1; i >-1; i--) {
            int val = arr[i]*(n-i);
            if(max <val){
                max = val;
            }
        }
        System.out.println(max);
    }
}
