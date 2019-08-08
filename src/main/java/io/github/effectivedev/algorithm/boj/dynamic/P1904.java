package io.github.effectivedev.algorithm.boj.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 01타일
 * https://www.acmicpc.net/problem/1904
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-08 08:46
 */
public class P1904 {
    private static final int MODE = 15746;
    public static void main(String args[]) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            int n = Integer.parseInt(br.readLine());
            int prev = 1;
            int current = 2;
            int temp;
            for (int i = 3; i <= n; i++) {
                temp = current;
                current = prev%MODE+current%MODE;
                prev = temp;
            }
            System.out.println(current%MODE);
        }
    }
}
