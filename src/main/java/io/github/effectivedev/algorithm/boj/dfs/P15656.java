package io.github.effectivedev.algorithm.boj.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * N과 M (7)
 * https://www.acmicpc.net/problem/15656
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 16/09/2019 5:35 오후
 */

public class P15656 {
    static int[] result;
    static int[] arr;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        arr = new int[N];
        result = new int[M];
        visited = new boolean[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        dfs(N, M, 0);
        System.out.print(sb);
    }
    private static void dfs(int n, int m, int depth){
        if(m == depth){
            for (int i = 0; i < m; i++) {
                sb.append(result[i]);
                sb.append(" ");
            }
            sb.append("\n");
            return;
        }else{
            for (int i = 0; i < n; i++) {
                if(visited[i]){
                    continue;
                }
                if(depth>= 1 && arr[i]< result[depth-1]){
                    continue;
                }
                result[depth] = arr[i];
                visited[i] = true;
                dfs(n, m, depth+1);
                visited[i] = false;
            }
        }
    }
}