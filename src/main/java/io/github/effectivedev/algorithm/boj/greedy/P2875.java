package io.github.effectivedev.algorithm.boj.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 대회 or 인턴
 * https://www.acmicpc.net/problem/2875
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-30 13:12
 */

public class P2875 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int cnt = 0;
        while (n >= 2 && m >= 1) {
            n = n - 2;
            m = m - 1;
            if (n + m - k >= 0) {
                cnt++;
            } else {
                break;
            }
        }
        System.out.println(cnt);
    }
}
