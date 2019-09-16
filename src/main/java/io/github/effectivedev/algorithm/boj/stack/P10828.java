package io.github.effectivedev.algorithm.boj.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * 스택
 * https://www.acmicpc.net/problem/10828
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 16/09/2019 9:28 오전
 */

public class P10828 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String data = br.readLine();
            if(data.contains("push")){
                String[] result = data.split(" ");
                st.push(Integer.parseInt(result[1]));
            }else if("top".equals(data)){
                if(!st.isEmpty()){
                    sb.append(st.peek());
                }else{
                    sb.append("-1");
                }
                sb.append("\n");
            }else if("size".equals(data)){
                sb.append(st.size());
                sb.append("\n");
            }else if("empty".equals(data)){
                sb.append(st.isEmpty()? 1:0);
                sb.append("\n");
            }else if("pop".equals(data)){
                if(st.isEmpty()){
                    sb.append("-1");
                }else{
                    sb.append(st.pop());
                }
                sb.append("\n");
            }
        }
        System.out.print(sb);

    }
}
