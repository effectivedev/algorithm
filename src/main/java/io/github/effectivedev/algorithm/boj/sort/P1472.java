package io.github.effectivedev.algorithm.boj.sort;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/**
 * 소트인사이드
 * https://www.acmicpc.net/problem/1472
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-07 21:54
 */
public class P1472 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        StringBuilder sb = new StringBuilder();
        Arrays.stream(line.split("")).mapToInt(Integer::parseInt).boxed().sorted(Collections.reverseOrder()).forEach(sb::append);
        System.out.println(sb);
    }
}