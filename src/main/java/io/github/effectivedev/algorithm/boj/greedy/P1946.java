package io.github.effectivedev.algorithm.boj.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        Person[] pArr;
        boolean[] isFail;
        int cnt;
        for (int i = 0; i < n; i++) {
            cnt = Integer.parseInt(br.readLine());
            pArr = new Person[cnt];
            isFail = new boolean[cnt];
            for (int j = 0; j < cnt; j++) {
                st = new StringTokenizer(br.readLine());
                pArr[j] = new Person();
                pArr[j].doc = Integer.parseInt(st.nextToken());
                pArr[j].interview = Integer.parseInt(st.nextToken());
            }
            for (int j = 0; j < cnt; j++) {
                for (int k = 0; k < cnt; k++) {
                    if ((j != k) && !isFail[k] && (pArr[j].doc < pArr[k].doc) && (pArr[j].interview < pArr[k].interview)) {
                        isFail[k] = true;
                    }
                }
            }
            int passCnt = 0;
            for (int j = 0; j < cnt; j++) {
                if (!isFail[j]) {
                    passCnt++;
                }
            }
            sb.append(passCnt).append("\n");
        }
        System.out.println(sb.toString());
    }

    static class Person {
        int doc;
        int interview;
    }
}
