package io.github.effectivedev.algorithm.boj.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문자열
 * https://www.acmicpc.net/problem/1120
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-09-01 18:06
 */

public class P1120 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        char[] arrA = st.nextToken().toCharArray();
        char[] arrB = st.nextToken().toCharArray();
        getGap(arrA, arrB);

    }

    private static void getGap(char[] arrA, char[] arrB) {
        int cnt = 0;
        int minCnt = Integer.MAX_VALUE;
        int lengthB = arrB.length;
        int lengthA = arrA.length;
        int gapLength = lengthB - lengthA;
        for (int i = 0; i <= gapLength; i++) {
            cnt = 0;
            for (int j = 0; j < lengthA; j++) {
                if (arrA[j] != arrB[j+i]) {
                    cnt++;
                }
            }
            minCnt = Math.min(cnt, minCnt);
        }
        System.out.println(minCnt);
    }
}
