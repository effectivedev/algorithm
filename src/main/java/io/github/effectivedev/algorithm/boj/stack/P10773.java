package io.github.effectivedev.algorithm.boj.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 제로
 * https://www.acmicpc.net/problem/10773
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 16/09/2019 10:58 오전
 */

public class P10773 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < K; i++) {
            int n = Integer.parseInt(br.readLine());
            if(n != 0){
                st.push(n);
            }else{
                st.pop();
            }
        }
        int sum=0;
        while(!st.isEmpty()){
            sum += st.pop();
        }
        System.out.println(sum);
    }
}
