package io.github.effectivedev.algorithm.boj.forstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * BABBA
 * https://www.acmicpc.net/problem/9625
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 09/09/2019 2:44 오후
 */

public class P9625 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        //1   0 1 B
        //2   1 1 BA
        //3   1 2 BAB
        //4   2 3 BABBA
        //5   3 5 BABBABAB B는이전 A의갯수더함
        int[] a = new int[47];
        a[1] = 0;
        a[2] = 1;
        for (int i = 3; i <= 46; i++) {
            a[i] = a[i-1]+ a[i-2];
        }
        System.out.println(a[K]+" "+a[K+1]);
    }
}
