package io.github.effectivedev.algorithm.boj.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * 암호 만들기
 * https://www.acmicpc.net/problem/1759
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 18/09/2019 12:44 오후
 */

public class P1759 {
    static int R;
    static int N;
    static StringBuilder sb = new StringBuilder();
    static String[] arr;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        arr = br.readLine().split(" ");
        Arrays.sort(arr);
        combination(N, R, new Stack<Integer>(), sb);
        System.out.print(sb);
    }

    private static void combination(int n, int r, Stack<Integer> st, StringBuilder sb) {
        if (r == 0) {
            if(checkCount(st)){
                for (int i = 0; i < st.size(); i++) {
                    sb.append(arr[st.get(i) -1]);
                }
                sb.append("\n");
            }
            return;
        } else {
            int smallest = st.isEmpty() ? 1 : st.peek() + 1;
            for (int i = smallest; i < n + 1; i++) {
                st.push(i);
                combination(n, r - 1, st, sb);
                st.pop();
            }
        }
    }

    private static boolean checkCount(Stack<Integer> st) {
        int cntJa = 0;
        int cntMo = 0;
        for (int i = 0; i < st.size(); i++) {
            String str = arr[st.get(i) - 1];
            if ("a".equals(str) || "e".equals(str) || "i".equals(str) || "o".equals(str) || "u".equals(str)) {
                cntMo++;
            }else{
                cntJa++;
            }
        }
        return cntJa>=2 && cntMo>=1;
    }
}
