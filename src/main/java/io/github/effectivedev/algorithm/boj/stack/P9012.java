package io.github.effectivedev.algorithm.boj.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
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
            ArrayList<Character> list = new ArrayList<>();
            String data = br.readLine();
            for (int j = 0; j < data.length() ; j++) {
                list.add(data.charAt(j));
            }
            while(list.size() != 0){
                boolean hasVal = false;
                for (int j = 0; j < list.size()-1; j++) {
                    if(list.get(j) == '(' && list.get(j+1) == ')'){
                        list.remove(j);
                        list.remove(j+1);
                        hasVal = true;
                    }
                }
                if(!hasVal){
                    break;
                }
            }
            if(list.size() == 0){
                sb.append("YES");
            }else{
                sb.append("NO");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
