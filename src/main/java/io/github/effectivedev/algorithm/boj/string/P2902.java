package io.github.effectivedev.algorithm.boj.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * KMP는 왜 KMP일까?
 * https://www.acmicpc.net/problem/2902
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-21 12:33
 */

public class P2902 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");
        StringBuilder sb = new StringBuilder();
        while(st.hasMoreTokens()){
            sb.append(st.nextToken().charAt(0));
        }
        System.out.println(sb);

    }
}
