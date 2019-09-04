package io.github.effectivedev.algorithm.boj.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 로또
 * https://www.acmicpc.net/problem/6603
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-09-04 09:31
 */

public class P6603 {
    static StringBuilder sb = new StringBuilder();

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data;
        StringTokenizer st;
        while ((data = br.readLine()) != null && !"0".equals(data)) {
            st = new StringTokenizer(data);
            int cnt = Integer.parseInt(st.nextToken());
            int[] arrTest = new int[cnt];
            for (int i = 0; i < cnt; i++) {
                arrTest[i] = Integer.parseInt(st.nextToken());
            }
            combination(new int[cnt], cnt, 6, 0, 0, arrTest);
            sb.append("\n");
        }
        System.out.println(sb.toString().trim());
    }

    private static void combination(int[] arr, int n, int r, int index, int target, int[] result) {
        if (r == 0) {
            for (int i = 0; i < 6; i++) {
                sb.append(result[arr[i]]);
                sb.append(" ");
            }
            sb.append("\n");
            return;
        } else if (target == n) {
            return;
        } else {
            arr[index] = target;
            combination(arr, n, r - 1, index + 1, target + 1, result);
            combination(arr, n, r, index, target + 1, result);
        }
    }
}
