package io.github.effectivedev.algorithm.boj.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

/**
 * 찍기
 * https://www.acmicpc.net/problem/2966
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 06/09/2019 2:18 오후
 */

public class P2966 {
    private static final char[] ADRIAN_PATTERN = {'A', 'B', 'C'};
    private static final char[] BRUNO_PATTERN = {'B', 'A', 'B', 'C'};
    private static final char[] GORAN_PATTERN = {'C', 'C', 'A', 'A', 'B', 'B'};
    private static final String[] person = {"Adrian", "Bruno", "Goran"};
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[] realAnswerArr = br.readLine().toCharArray();
        int cntAdrian = 0;
        int cntBruno = 0;
        int cntGolan = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            char real = realAnswerArr[i];
            if(real == getAnswer(i, 0)){
                cntAdrian++;
                max = Math.max(max, cntAdrian);
            }
            if(real == getAnswer(i, 1)){
                cntBruno++;
                max = Math.max(max, cntBruno);
            }
            if(real == getAnswer(i, 2)){
                cntGolan++;
                max = Math.max(max, cntGolan);
            }
        }
        System.out.println(max);
        if(max == cntAdrian){
            System.out.println(person[0]);
        }
        if(max == cntBruno){
            System.out.println(person[1]);
        }
        if(max ==cntGolan){
            System.out.println(person[2]);
        }
    }
    private static char getAnswer(int n, int type) {
        if (type == 0) {
            return ADRIAN_PATTERN[n % 3];
        } else if (type == 1) {
            return BRUNO_PATTERN[n % 4];
        } else {
            return GORAN_PATTERN[n % 6];
        }
    }
}