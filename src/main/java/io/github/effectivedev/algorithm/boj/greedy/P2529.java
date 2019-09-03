package io.github.effectivedev.algorithm.boj.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 부등호
 * https://www.acmicpc.net/problem/2529
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-09-02 14:13
 */

public class P2529 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] b = br.readLine().split(" ");
        System.out.println(Arrays.toString(b));
    }
    // < < 789
    // < > 897
    // > > 987
    // > < 978

    // < < < 6789
    // < < > 7896
    // < > < 8967
    // < > > 8976
}
