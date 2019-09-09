package io.github.effectivedev.algorithm.boj.forstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 농구 경기
 * https://www.acmicpc.net/problem/1159
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 09/09/2019 2:21 오후
 */

public class P1159 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[26];
        for (int i = 0; i < N; i++) {
            String data = br.readLine();
            arr[data.charAt(0) - 'a'] += 1;
        }
        StringBuilder sb = new StringBuilder();
        boolean isPossible = false;
        for (int i = 0; i < 26; i++) {
            if (arr[i] >= 5) {
                isPossible = true;
                sb.append((char)(i+'a'));
            }
        }
        if(isPossible){
            System.out.println(sb);
        }else{
            System.out.println("PREDAJA");
        }
    }
}
