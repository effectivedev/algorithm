package io.github.effectivedev.algorithm.boj.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 알파벳 개수
 * https://www.acmicpc.net/problem/10808
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-21 12:15
 */

public class P10808 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data = br.readLine();
        int[]arr = new int[26];
        for (int i = 0, length =data.length() ; i < length ; i++) {
            int num = (int)data.charAt(i) - 97;
            arr[num] +=1;
        }
        StringBuilder sb = new StringBuilder();
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);

    }
}
