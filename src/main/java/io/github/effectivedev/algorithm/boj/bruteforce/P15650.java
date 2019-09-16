package io.github.effectivedev.algorithm.boj.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * N과 M (2)
 * https://www.acmicpc.net/problem/15650
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 16/09/2019 3:08 오후
 */

public class P15650 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        combination(N, M, new Stack<Integer>(), sb);
        System.out.print(sb);
    }
    private static void combination(int n, int r, Stack<Integer> st, StringBuilder sb){
        if(r == 0){
            for (int i = 0; i < st.size(); i++) {
                sb.append(st.get(i));
                if(i != st.size() -1){
                    sb.append(" ");
                }
            }
            sb.append("\n");
            return;
        }else{
            int smallest = st.isEmpty()? 1 : st.peek()+1;
            for (int i = smallest; i < n+1 ; i++) {
                st.push(i);
                combination(n, r-1, st, sb);
                st.pop();
            }
        }
    }
}
