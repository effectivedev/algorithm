package io.github.effectivedev.algorithm.boj.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 단어 나누기
 * https://www.acmicpc.net/problem/1251
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 06/09/2019 3:53 오후
 */

public class P1251 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] word = br.readLine().toCharArray();
        int length = word.length;
        int[] arr = new int[length];
        List<String> list = new ArrayList<>();
        combination(arr, length, 2, 0, 0, word, list);
        Collections.sort(list);
        System.out.println(list.get(0));
    }

    private static void combination(int[] arr, int n, int r, int index, int target, char[] result, List<String> list) {
        if (r == 0) {
            StringBuilder sb = new StringBuilder();
            for (int i = arr[0]; i > -1 ; i--) {
                sb.append(result[i]);
            }
            for (int i = arr[1]; i > arr[0] ; i--) {
                sb.append(result[i]);
            }
            for (int i = result.length-1; i > arr[1] ; i--) {
                sb.append(result[i]);
            }
            list.add(sb.toString());
            return;
        } else if (target == n) {
            return;
        } else {
            arr[index] = target;
            combination(arr, n, r - 1, index + 1, target + 1, result, list);
            combination(arr, n, r, index, target + 1, result, list);
        }
    }
}
