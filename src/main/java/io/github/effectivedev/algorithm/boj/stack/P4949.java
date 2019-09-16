package io.github.effectivedev.algorithm.boj.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 균형잡힌 세상
 * https://www.acmicpc.net/problem/4949
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 16/09/2019 11:12 오전
 */

public class P4949
{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String data;
        while((data = br.readLine()) != null && !".".equals(data)){
            Stack<Character> st = new Stack();
            boolean isBalance = true;
            for (int i = 0; i < data.length(); i++) {
                char c= data.charAt(i);
                if(c == '(' || c == '['){
                    st.push(c);
                }else if( c== ')'){
                    if(!st.isEmpty() && st.peek() =='('){
                        st.pop();
                    }else{
                        isBalance = false;
                        break;
                    }
                }else if(c ==']'){
                    if(!st.isEmpty() && st.peek() =='['){
                        st.pop();
                    }else{
                        isBalance = false;
                        break;
                    }
                }
            }
            if(st.isEmpty() && isBalance){
                sb.append("yes");
            }else{

                sb.append("no");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
