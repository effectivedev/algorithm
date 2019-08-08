package io.github.effectivedev.algorithm.boj.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 파도반 수열
 * https://www.acmicpc.net/problem/9461
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-08 09:34
 */
public class P9461 {
    public static void main(String args[]) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
            int testCnt = Integer.parseInt(br.readLine());
            long[]sequence = new long[101];
            sequence[1]=1;
            sequence[2]=1;
            sequence[3]=1;
            for (int i = 4; i <= 100 ; i++) {
                sequence[i] = sequence[i-2]+sequence[i-3];
            }
            StringBuilder sb = new StringBuilder();
            while(testCnt-- >0){
                int n = Integer.parseInt(br.readLine());
                sb.append(sequence[n]).append("\n");
            }
            System.out.println(sb.toString());
        }
    }
}
