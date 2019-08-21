package io.github.effectivedev.algorithm.boj.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 카이사르 암호
 * https://www.acmicpc.net/problem/5598
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-21 16:07
 */

public class P5598 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < data.length(); i++) {
            int v = data.charAt(i);
            //d~z 까지는 -3
            if (v >= 68 && v <= 90) {
                sb.append((char) (v - 3));
            } else {
                sb.append((char) (v + 23));
            }
        }
        System.out.println(sb);
    }
}
