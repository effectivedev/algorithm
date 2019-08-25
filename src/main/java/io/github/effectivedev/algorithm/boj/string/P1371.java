package io.github.effectivedev.algorithm.boj.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 가장 많은 글자
 * https://www.acmicpc.net/problem/1371
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-25 15:35
 */

public class P1371 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String data = null;
        int[] result = new int[26];
        while((data = br.readLine()) != null){
            sb.append(data);
            sb.append("\n");
        }
        br.close();
        String sentence = sb.toString();
        for (int i = 0; i < sentence.length() ; i++) {
            int p = (int) sentence.charAt(i) - 97;
            if(p >= 26 || p <0){
                continue;
            }
            result[p] += 1;
        }
        int max = result[0];
        int length = result.length;
        for (int i = 1; i < length; i++) {
            int res = result[i];
            if(max < res){
                max = res;
            }
        }
        sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if(max == result[i]){
                sb.append((char)((int)i + 97));
            }
        }
        System.out.println(sb);
    }
}
