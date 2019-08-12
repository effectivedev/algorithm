package io.github.effectivedev.algorithm.boj.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 소수 구하기
 * https://www.acmicpc.net/problem/1929
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-12 13:57
 */

public class P1929 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");
        int m = Integer.parseInt(nums[0]);
        int n = Integer.parseInt(nums[1]);
        boolean[] res = new boolean[n + 1];
        Arrays.fill(res, true);
        res[0] = false;
        res[1] = false;
        for (int i = 2, length = (int) Math.sqrt(n); i <= n; i++) {
            if (res[i]) {
                for (int j = 2, len =n/i; j <= len; j++) {
                    res[i * j] = false;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = m; i <= n; i++) {
            if(res[i] == true){
                sb.append(i).append("\n");
            }
        }
        System.out.print(sb);
    }
}
