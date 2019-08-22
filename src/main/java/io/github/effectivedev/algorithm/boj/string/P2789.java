package io.github.effectivedev.algorithm.boj.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 유학금지
 * https://www.acmicpc.net/problem/2789
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-22 08:22
 */

public class P2789 {
    private static final String cambridge = "CAMBRIDGE";

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data = br.readLine();
        int length = cambridge.length();
        for (int i = 0; i < length; i++) {
            data = data.replaceAll(String.valueOf(cambridge.charAt(i)), "");
        }
        System.out.println(data);
    }
}
