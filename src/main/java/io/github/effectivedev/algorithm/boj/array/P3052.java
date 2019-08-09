package io.github.effectivedev.algorithm.boj.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 나머지
 * https://www.acmicpc.net/problem/3052
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-09 14:56
 */

public class P3052 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
               int[] newArr = new int[10];
        for (int i = 0; i < 10 ; i++) {
            newArr[i] = Integer.parseInt(br.readLine());
        }
        int[]result = new int[42];
        for (int i = 0; i < 10; i++) {
            int r = newArr[i] % 42;
            result[r] += 1;
        }
        int cnt=0;
        for (int i = 0; i <42 ; i++) {
            if(result[i] != 0)
                cnt++;
        }
        System.out.println(cnt);
    }
}
