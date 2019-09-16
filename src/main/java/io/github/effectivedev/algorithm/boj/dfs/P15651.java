package io.github.effectivedev.algorithm.boj.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * N과 M (3)
 * https://www.acmicpc.net/problem/15651
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 16/09/2019 4:11 오후
 */

public class P15651 {
    static StringBuilder sb = new StringBuilder();
    static int[] result;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        result = new int[M];
        dfs(N, M, 0);
        System.out.print(sb);
    }
    private static void dfs(int n, int m, int depth) {
        if (depth == m) {
            for (int i = 0; i < result.length; i++) {
                sb.append(result[i]);
                sb.append(" ");
            }
            sb.append("\n");
            return;
        } else {
            for (int i = 0; i < n; i++) {
                result[depth] = i+1;
                dfs(n, m, depth + 1);
            }
        }
    }
}
