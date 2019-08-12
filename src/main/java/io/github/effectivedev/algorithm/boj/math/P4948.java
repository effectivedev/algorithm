package io.github.effectivedev.algorithm.boj.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 베르트랑 공준
 * https://www.acmicpc.net/problem/4948
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-12 14:20
 */

public class P4948 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] res = new boolean[123456*2+1];
        Arrays.fill(res, true);
        res[0] = false;
        res[1] = false;
        for (int i = 2, length = (int) Math.sqrt(123456*2); i <= length; i++) {
            if (res[i]) {
                for (int j = 2, len =2*123456/i; j <= len; j++) {
                    res[i * j] = false;
                }
            }
        }
        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n == 0){
                break;
            }
            int cnt = 0;
            for (int i = n+1, length =2*n; i <= length; i++) {
                if(res[i] == true){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }

    }
}
