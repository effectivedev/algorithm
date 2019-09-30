package io.github.effectivedev.algorithm.boj.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * 오큰수
 * https://www.acmicpc.net/problem/17298
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 27/09/2019 4:27 오후
 */

public class P17298 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();
        Stack<Pair> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            while (!stack.isEmpty()) {
                if (stack.peek().val < arr[i]) {
                    sb.append(i);
                    sb.append(" ");
                    stack.pop();
                }
                stack.push(new Pair(i, arr[i]));
            }
        }
        System.out.println(sb);
    }

    static class Pair {
        int idx;
        int val;

        public Pair(int idx, int val) {
            this.idx = idx;
            this.val = val;
        }
    }
}
