package io.github.effectivedev.algorithm.boj.function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 팩토리얼
 * https://www.acmicpc.net/problem/10872
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-09 16:13
 */

public class P10872 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int num = 1;
        if (n == 1) {
            System.out.println(n);
        } else {
            while (n > 0) {
                num *= n;
                n--;
            }
            System.out.println(num);
        }
    }
}
