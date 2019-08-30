package io.github.effectivedev.algorithm.boj.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringJoiner;

/**
 * 30
 * https://www.acmicpc.net/problem/10610
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-30 08:42
 */

public class P10610 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer[] arr = br.readLine().chars().map(i -> i - '0').boxed().toArray(Integer[]::new);
        int length = arr.length;
        int sum = 0;
        boolean hasZero = false;
        for (int i = 0; i < length; i++) {
            int num = arr[i];
            sum += num;
            if (num == 0 && hasZero == false) {
                hasZero = true;
            }
        }
        if (hasZero && sum % 3 == 0) {
            Arrays.sort(arr, Collections.reverseOrder());
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < length; i++) {
                sb.append(arr[i]);
            }
            System.out.println(sb.toString());
        } else {
            System.out.println("-1");
        }
    }
}
