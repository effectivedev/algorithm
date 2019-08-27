package io.github.effectivedev.algorithm.boj.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 8진수 2진수
 * https://www.acmicpc.net/problem/1212
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 27/08/2019 11:17 오후
 */

public class P1212 {
    static String[] two = {"000", "001", "010", "011", "100", "101", "110", "111"};
    static String[] twoFirst = {"0", "1", "10", "11", "100", "101", "110", "111"};

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data = br.readLine();
        StringBuilder sb = new StringBuilder();
        int length = data.length();
        for (int i = 0; i < length; i++) {
            int t = data.charAt(i)- '0';
            if (i == 0) {
                sb.append(twoFirst[t]);
            } else {
                sb.append(two[t]);
            }
        }
        System.out.println(sb);
    }
}
