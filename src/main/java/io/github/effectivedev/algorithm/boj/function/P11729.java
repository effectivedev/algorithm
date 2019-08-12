package io.github.effectivedev.algorithm.boj.function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 하노이 탑 이동 순서
 * https://www.acmicpc.net/problem/11729
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-12 08:37
 */

public class P11729 {
    static int cnt = 0;
    static StringBuilder sb = new StringBuilder();
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(hanoi(n,1,2,3));
        System.out.print(sb);
    }

    private static int hanoi(int n, int start, int mid, int end ){
        if(n == 1){
            sb.append(start).append(" ").append(end).append("\n");
        }
        else{
            hanoi(n-1, start, end, mid);
            sb.append(start).append(" ").append(end).append("\n");
            hanoi(n-1, mid, start, end);
        }
        cnt++;
        return cnt;
    }
}

