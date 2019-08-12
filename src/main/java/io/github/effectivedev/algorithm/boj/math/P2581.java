package io.github.effectivedev.algorithm.boj.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 소수
 * https://www.acmicpc.net/problem/2581
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-12 12:37
 */

public class P2581 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        boolean[] res = new boolean[n + 1];
        Arrays.fill(res, true);
        res[0] = false;
        res[1] = false;
        for (int i = 2, length = (int) Math.sqrt(n); i <= n; i++) {
            if (res[i]) {
                for (int j = 2; j <= n / i; j++) {
                    res[i * j] = false;
                }
            }
        }
        int sum = 0;
        int min = 0;
        for (int i = m; i <= n; i++) {
            if (res[i] == true) {
                if (min == 0) {
                    min = i;
                }
                sum += i;
            }
        }
        if (sum == 0) {
            System.out.println("-1");
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
