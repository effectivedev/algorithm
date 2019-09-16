package io.github.effectivedev.algorithm.boj.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

/**
 * 괄호
 * https://www.acmicpc.net/problem/9012
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 11/09/2019 5:40 오후
 */

public class P9012 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String data = br.readLine();
            Stack<Character> st = new Stack<>();
            boolean isVPS = true;
            for (int j = 0; j < data.length(); j++) {
                if(data.charAt(j) == '('){
                    st.push(data.charAt(j));
                }else{
                    if(!st.isEmpty()){
                        st.pop();
                    }else{
                        isVPS = false;
                        break;
                    }
                }
            }
            if(!st.isEmpty() || !isVPS){
                sb.append("NO");
            }else{
                sb.append("YES");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
