package io.github.effectivedev.algorithm.boj.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 접미사 배열
 * https://www.acmicpc.net/problem/11656
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-21 15:39
 */

public class P11656 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] data = br.readLine().split("");
        int length = data.length;
        String[] arr=  new String[length];
        for (int i = 0; i < length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < length ; j++) {
                sb.append(data[j]);
            }
            arr[i] = sb.toString();
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append((arr[i])).append("\n");
        }
        System.out.println(sb);
    }
}
