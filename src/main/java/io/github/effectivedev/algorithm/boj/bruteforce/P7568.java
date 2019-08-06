package io.github.effectivedev.algorithm.boj.bruteforce;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * BOJ 7568 덩치
 * https://www.acmicpc.net/problem/7568
 *
 * @author effectivedev
 */
public class P7568 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {

            int cnt = Integer.parseInt(br.readLine());
            String[] personData = new String[cnt];
            int[] rank = new int[cnt];

            for (int i = 0; i < cnt; i++) {
                personData[i] = br.readLine();
                rank[i] = 1;
            }
            for (int i = 0; i < cnt; i++) {
                StringTokenizer st = new StringTokenizer(personData[i], " ");
                int weight1 = Integer.parseInt(st.nextToken());
                int height1 = Integer.parseInt(st.nextToken());
                if (rank[i] == cnt) continue;
                for (int j = 0; j < cnt; j++) {
                    if (i == j) continue;
                    if (rank[j] == cnt) continue;
                    StringTokenizer st2 = new StringTokenizer(personData[j], " ");
                    int weight2 = Integer.parseInt(st2.nextToken());
                    int height2 = Integer.parseInt(st2.nextToken());
                    if (weight1 < weight2 && height1 < height2) {
                        rank[i]++;
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < cnt; i++) {
                sb.append(rank[i] + " ");
            }
            bw.write(sb.toString());
        }
    }
}