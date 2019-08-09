package io.github.effectivedev.algorithm.boj.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 최소, 최대
 * https://www.acmicpc.net/problem/10818
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-09 13:19
 */

public class P10818 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int[] numArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.stream(numArr).min().getAsInt()+" "+Arrays.stream(numArr).max().getAsInt());
    }
}

