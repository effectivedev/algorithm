package io.github.effectivedev.algorithm.boj.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 전깃줄
 * https://www.acmicpc.net/problem/2565
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-26 13:34
 */

public class P2565 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int line[] = new int[501];
        StringTokenizer st = null;
        for (int i = 0; i < n; i++) {
            st =new StringTokenizer(br.readLine(), " ");
            line[Integer.parseInt(st.nextToken())] = Integer.parseInt(st.nextToken());
        }
        System.out.println(Arrays.toString(line));
    }
}
