package io.github.effectivedev.algorithm.boj.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 골드바흐의 추측
 * https://www.acmicpc.net/problem/9020
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-12 14:30
 */

public class P9020 {
    static boolean res[];
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        res = eratosthenes();

        int n = Integer.parseInt(br.readLine());
        while(n-- >0){
            int num = Integer.parseInt(br.readLine());
            getGoldNum(num);
        }
    }

    private static boolean[] eratosthenes() {
        res = new boolean[10000+1];
        Arrays.fill(res, true);
        res[0] = false;
        res[1] = false;
        //prime 배열 생성
        for (int i = 2, length = (int) Math.sqrt(10000); i <= length; i++) {
            if (res[i]) {
                for (int j = 2, len =10000/i; j <= len; j++) {
                    res[i * j] = false;
                }
            }
        }
        return res;
    }

    private static void getGoldNum(int c) throws IOException {
        int idx = c/2;
        for (int i = idx, j = idx; i >=0 && j<=c; i++, j--) {
            if(res[i] &&res[j]){
                if(i>j){
                    System.out.printf("%d %d\n", j, i);
                }else{
                    System.out.printf("%d %d\n", i, j);
                }

                break;
            }
        }
    }
}
