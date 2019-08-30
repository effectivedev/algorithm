package io.github.effectivedev.algorithm.boj.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 30
 * https://www.acmicpc.net/problem/10610
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-30 08:42
 */

public class P10610 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer[] arr = br.readLine().chars().map(i -> i - '0').boxed().toArray(Integer[]::new);
        int length = arr.length;
        int[] cnt = new int[10];
        int sum = 0;
        for (int i = 0; i < length; i++) {
            int num = arr[i];
            cnt[num]++; //숫자별 카운트 세기
            sum += num;
        }
        //30의 배수 조건
        if (cnt[0] != 0 && sum % 3 == 0) {
            StringBuilder sb = new StringBuilder();
            for (int i = 9; i >= 0; i--) {
                int count = cnt[i];
                for (int j = 0; j < count; j++) {
                    sb.append(i);
                }
            }
            System.out.println(sb.toString());
        } else {
            System.out.println("-1");
        }
    }
}
