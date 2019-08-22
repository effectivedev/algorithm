package io.github.effectivedev.algorithm.boj.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 좋은 단어
 * https://www.acmicpc.net/problem/3986
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-22 14:20
 */

public class P3986 {
    private static final char BLANK = '\0';
    private static final char A = 'A';
    private static final char B = 'B';

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String line = null;
        char[] word = null;
        char[] result =null;

        int cnt = 0;
        for (int i = 0; i <n; i++) {
            line = br.readLine();
            word = line.toCharArray();
            result = new char[100000];
            int length = word.length;
            int index = 0;
            for (int j = 0; j < length; j++) {
                result[index++] = word[j];
                if (index >= 2) {
                    char currentChar = result[index - 1];
                    char prevChar = result[index - 2];
                    if (((currentChar == A) && (prevChar == A)) || ((currentChar == B) && (prevChar == B))) {
                        result[index] = BLANK;
                        index = index - 2;
                    }
                }
            }
            if(index == 0){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}

