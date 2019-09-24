package io.github.effectivedev.algorithm.boj.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 나는 요리사다
 * https://www.acmicpc.net/problem/2953
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 24/09/2019 10:37 오전
 */

public class P2953 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int max = 0;
        int idx = 0;
        int[] sum = new int[5];
        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4; j++) {
                sum[i] += Integer.parseInt(st.nextToken());
            }
            max = Math.max(sum[i], max);
        }
        for (int i = 0; i < 5; i++) {
            if(max == sum[i]){
                idx = i;
                break;
            }
        }
        System.out.println((idx+1)+" "+ max);
    }
}
