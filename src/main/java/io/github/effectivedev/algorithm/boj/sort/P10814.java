package io.github.effectivedev.algorithm.boj.sort;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 나이순 정렬
 * https://www.acmicpc.net/problem/10814
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-13 11:21
 */

public class P10814 {
    public static void main(String args[]) throws IOException {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
            int T = Integer.parseInt(br.readLine());
            StringBuilder[] ageSb = new StringBuilder[201];
            for (int i = 0; i < 201; i++) {
                ageSb[i] = new StringBuilder("");
            }
            for (int i = 0; i < T; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                int age = Integer.parseInt(st.nextToken());
                ageSb[age].append(age).append(" ").append(st.nextToken()).append("\n");
            }
            for (StringBuilder sb :
                    ageSb) {
                bw.write(sb.toString());
            }
        }
    }
}
