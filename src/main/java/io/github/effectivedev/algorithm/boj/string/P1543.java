package io.github.effectivedev.algorithm.boj.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문서 검색
 * https://www.acmicpc.net/problem/1543
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-23 10:06
 */

public class P1543 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data = br.readLine();
        String keyword = br.readLine();
        int keyLength = keyword.length();
        int cnt = 0;
        int index = 0;
        int fromIndex = 0;
        for (int i = 0; i < data.length(); i++) {
            if((index =data.indexOf(keyword, fromIndex)) > -1){
                i = index+keyLength-1;
                fromIndex = index+keyLength;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
