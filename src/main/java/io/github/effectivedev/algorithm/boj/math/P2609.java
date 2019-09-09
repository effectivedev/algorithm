package io.github.effectivedev.algorithm.boj.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 최대공약수와 최소공배수
 * https://www.acmicpc.net/problem/2609
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 09/09/2019 9:07 오전
 */

public class P2609 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int ab = a*b;
        int temp;
        if(a < b){
            temp = a;
            a = b;
            b = temp;
        }
        while( a % b != 0){
            temp = a % b;
            a = b;
            b = temp;
        }
        System.out.println(b);
        System.out.println(ab/b);
    }
}
