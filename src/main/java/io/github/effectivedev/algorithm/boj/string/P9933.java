package io.github.effectivedev.algorithm.boj.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 민균이의 비밀번호
 * https://www.acmicpc.net/problem/9933
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 24/08/2019 8:56 오후
 */

public class P9933 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String[] password = new String[T];
        String[] reversePassword = new String[T];
        for (int i = 0; i < T; i++) {
            password[i] = br.readLine();
        }
        br.close();
        //역순 패스워드 찾기
        for (int i = 0; i < T; i++) {
            String word = password[i];
            StringBuilder sb = new StringBuilder();
            for (int j = word.length() - 1; j >= 0; j--) {
                sb.append(word.charAt(j));
            }
            reversePassword[i] = sb.toString();
        }
        boolean isFind = false;
        for (int i = 0; i < T; i++) {
            String p = password[i];
            for (int j = 0; j < T; j++) {
                if (p.equals(reversePassword[j])) {
                    int length = p.length();
                    System.out.println(new StringBuilder().append(length).append(" ").append(p.charAt(length / 2)).toString());
                    isFind = true;
                    break;
                }
            }
            if (isFind) {
                break;
            }
        }
    }
}
