package io.github.effectivedev.algorithm.boj.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 모음의 개수
 * https://www.acmicpc.net/problem/10987
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-21 15:57
 */

public class P10987 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] word = br.readLine().split("");
        int length = word.length;
        int cnt = 0;
        for (int i = 0; i < length; i++) {
            if("a".equals(word[i]) || "e".equals(word[i]) || "i".equals(word[i]) || "o".equals(word[i]) || "u".equals(word[i])){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
