package io.github.effectivedev.algorithm.boj.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 초콜릿 자르기
 * https://www.acmicpc.net/problem/2163
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-21 10:11
 */

public class P2163 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int i = m*n;
        if(i == 1){
            System.out.println(0);
        }
        else{
            System.out.println(i-1);
        }
    }
}
