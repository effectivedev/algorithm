package io.github.effectivedev.algorithm.boj.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 일곱 난쟁이
 * https://www.acmicpc.net/problem/2309
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-09-04 08:34
 */

public class P2309 {
    static int cnt = 0;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dwarf = new int[9];
        for (int i = 0; i < dwarf.length; i++) {
            dwarf[i] = Integer.parseInt(br.readLine());
        }
        int[] arr = new int[9];
        combination(arr, 9, 7, 0,0, dwarf);

    }

    private static void combination(int[] arr, int n, int r, int index, int target, int[] result) {
        if (r == 0) {
            int sum = 0;
            for (int i = 0; i < 7; i++) {
                sum += result[arr[i]];
            }
            if(sum == 100 && cnt == 0){
                cnt++;
                List<Integer> list = new ArrayList<>();
                for (int i = 0; i < 7; i++) {
                    list.add(result[arr[i]]);
                }
                Collections.sort(list);
                for (int i = 0; i < 7; i++) {
                    System.out.println(list.get(i));
                }
            }
            return;
        } else if (target == n) {
            return;
        } else {
            arr[index] = target;
            combination(arr, n, r - 1, index+1, target+1, result);
            combination(arr, n, r, index, target+1, result);

        }
    }
}
