package io.github.effectivedev.algorithm.boj.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 이진수
 * https://www.acmicpc.net/problem/3460
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-23 08:32
 */

public class P3460 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int cnt = 0;
            while(num != 0){
                if(num % 2 == 1){
                    sb.append(cnt);
                    sb.append(" ");
                }
                num /= 2;
                cnt++;
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
