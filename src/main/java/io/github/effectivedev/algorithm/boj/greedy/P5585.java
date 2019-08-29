package io.github.effectivedev.algorithm.boj.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 거스름돈
 * https://www.acmicpc.net/problem/5585
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-30 01:24
 */

public class P5585 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 1000 -Integer.parseInt(br.readLine());
        int[]divider = {500, 100, 50, 10, 5, 1};

        int cnt = 0;
        for (int i = 0; i< divider.length; i++) {
            int div = divider[i];
            if(div <= n){
                cnt += (n / div);
                n = n % div;
            }
        }
        System.out.println(cnt);
    }
}
