package io.github.effectivedev.algorithm.boj.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

/**
 * 신입사원
 * https://www.acmicpc.net/problem/1946
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-30 14:22
 */

public class P1946 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int cnt;
        int[] arr;
        StringTokenizer st;
        int docRank;
        int interviewRank;
        //Doc 순위를 기준을 고정
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            cnt = Integer.parseInt(br.readLine());
            arr = new int[cnt+1];
            for (int j = 0; j < cnt; j++) {
                st = new StringTokenizer(br.readLine());
                docRank = Integer.parseInt(st.nextToken());
                interviewRank = Integer.parseInt(st.nextToken());
                arr[docRank] = interviewRank;
            }
            calc(t, cnt, arr);
        }
    }

    private static void calc(int n, int cnt, int[] arr) {
        int max = arr[1];
        int passCnt = 1;
        for (int j = 2; j <= cnt; j++) {
            if(arr[j] < max){
                passCnt++;
                max = arr[j];
            }
        }
        System.out.println(passCnt);
    }
}
