package io.github.effectivedev.algorithm.boj.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 명령 프롬프트
 * https://www.acmicpc.net/problem/1032
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-21 12:57
 */

public class P1032 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }
        br.close();

        int length = arr[0].length();
        StringBuilder sb = new StringBuilder();
        if(n == 1){
            System.out.println(arr[0]);
        }else{
            char[] result = new char[length];
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < length; j++) {
                    if ((int) arr[i].charAt(j) == (int) arr[i + 1].charAt(j) && result[j] != '*') {
                        result[j] = arr[i].charAt(j);
                    }else{
                        result[j] = '*';
                    }
                }
            }
            for (int i = 0; i < length; i++) {
                String val = String.valueOf(result[i]);
                if("*".equals(val)){
                    sb.append("?");
                }else{
                    sb.append(val);
                }
            }
        }
        System.out.println(sb);
    }
}
