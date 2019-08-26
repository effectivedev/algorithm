package io.github.effectivedev.algorithm.boj.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 한국이 그리울 떈 서버에 접속하지
 * https://www.acmicpc.net/problem/9996
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-26 08:38
 */

public class P9996 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String keyword = br.readLine();
        String[] word = new String[n];
        for (int i = 0; i < n; i++) {
            word[i] = br.readLine();
        }
        int position = keyword.indexOf("*");
        String repPre = keyword.substring(0, position);
        String repPost = keyword.substring(position + 1);
        String rep =
                new StringBuilder().append("^(").append(repPre).append(").*(").append(repPost).append(")$").toString();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String w = word[i];
            if(w.matches(rep)){
                sb.append("DA").append("\n");
            }
            else{
                sb.append("NE").append("\n");
            }
        }
        System.out.println(sb);
    }
}
