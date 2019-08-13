package io.github.effectivedev.algorithm.boj.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 단어정렬
 * https://www.acmicpc.net/problem/1181
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-13 10:27
 */

public class P1181 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String[]words = new String[T];
        for (int i = 0; i <T ; i++) {
            words[i] = br.readLine();
        }
        String newWords[] =Arrays.stream(words).distinct().toArray(String[]::new);
        Arrays.sort(newWords, (o1, o2) -> {
            if(o1.length() - o2.length() >0){
                return 1;
            }else{
                if(o1.length() == o2.length()){
                    return String.CASE_INSENSITIVE_ORDER.compare(o1, o2);
                }
                return -1;
            }
        });
        StringBuilder sb = new StringBuilder();
        for (int i = 0, length =newWords.length  ; i < length; i++) {
            sb.append(newWords[i]).append("\n");
        }
        System.out.println(sb);
    }
}
