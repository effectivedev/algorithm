package io.github.effectivedev.algorithm.boj.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 유레카 이론
 * https://www.acmicpc.net/problem/10448
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 06/09/2019 8:37 오전
 */

public class P10448 {
    static int count = 0;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[1001];
        for (int i = 1; i < 1001; i++) {
            arr[i] = i*(i+1) / 2;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            count = 0;
            go(0, Integer.parseInt(br.readLine()), arr, 1,  0);
            if(count >= 1){
                sb.append(1).append("\n");
            }else{
                sb.append(0).append("\n");
            }
        }
        System.out.print(sb);
    }
    private static void go(int sum, int goal, int[] arr, int index,  int cnt){
        if(((sum == goal) && (cnt == 3) || 3*arr[index] == goal)) {
            count++;
            return;
        }else{
            if((sum > goal) || arr[index] > goal || cnt > 3){
                return;
            }
            else{
                //선택 1개
                go(sum+arr[index], goal,  arr, index+1, cnt+1);
                //선택 2개
                go(sum+2*arr[index], goal,  arr, index+1, cnt+2);
                //선택 X
                go(sum, goal, arr, index+1, cnt);
            }
        }
    }
}
