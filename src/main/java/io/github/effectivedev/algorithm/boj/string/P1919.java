package io.github.effectivedev.algorithm.boj.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 애너그램 만들기
 * https://www.acmicpc.net/problem/1919
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 24/08/2019 7:57 오후
 */

public class P1919 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        int result[][] = new int[26][2];
        for (int i = 0; i < a.length(); i++) {
            int wordPosition = (int) a.charAt(i) - (int) 'a';
            result[wordPosition][0] += 1;
        }
        for (int i = 0; i < b.length(); i++) {
            int wordPosition = (int) b.charAt(i) - (int) 'a';
            result[wordPosition][1] += 1;
        }
        int cnt = 0;
        for (int i = 0; i < 26; i++) {
            cnt += Math.abs(result[i][0] - result[i][1]);
        }
        System.out.println(cnt);
    }
}
