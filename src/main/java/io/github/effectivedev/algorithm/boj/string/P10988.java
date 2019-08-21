package io.github.effectivedev.algorithm.boj.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 팰린드롬인지 확인하기
 * https://www.acmicpc.net/problem/10988
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-21 15:17
 */

public class P10988 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data[] = br.readLine().split("");
        int length = data.length;

        boolean isP = true;
        for (int i = 0, len = length/2; i < len; i++) {
            if(!data[i].equals(data[length-1-i])){
                isP = false;
                break;
            }
        }
        System.out.println(isP?1:0);
    }
}
