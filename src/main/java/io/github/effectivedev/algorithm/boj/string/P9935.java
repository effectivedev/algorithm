package io.github.effectivedev.algorithm.boj.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문자열 폭발
 * https://www.acmicpc.net/problem/9935
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-22 08:28
 */

public class P9935 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] data = br.readLine().toCharArray();
        char[] explosion = br.readLine().toCharArray();
        char[] result = new char[1000000];
        int length = data.length;
        int expLength = explosion.length;
        int index = 0;
        for (int i = 0; i < length; i++) {
            result[index++] = data[i];
            char lastExpVal = explosion[expLength - 1];
            boolean hasExpString = false;
            if (index >= expLength) {
                if (data[i] == lastExpVal) {
                    hasExpString = true;
                    int len = expLength - 1;
                    for (int j = index - 1; j >= index - expLength; j--) {
                        if (result[j] != explosion[len--]) {
                            hasExpString = false;
                            break;
                        }
                    }
                }
            }
            if (hasExpString) {
                index = index - expLength;
            }
        }
        if (index == 0) {
            System.out.println("FRULA");
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < index; i++) {
                sb.append(result[i]);
            }
            System.out.println(sb);
        }
    }
}
