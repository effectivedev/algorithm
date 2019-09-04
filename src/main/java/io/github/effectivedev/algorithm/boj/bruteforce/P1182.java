package io.github.effectivedev.algorithm.boj.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 부분수열의 합
 * https://www.acmicpc.net/problem/1182
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-09-04 09:59
 */

public class P1182 {
    static int cnt = 0;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 1; i <= n; i++) {
            combination(new int[n], n, i, 0,0, arr, i, s);
        }
        System.out.println(cnt);

    }
    private static void combination(int[] arr, int n, int r, int index, int target, int[] result, int originalR, int s) {
        if (r == 0) {
            int sum =0;
            for (int i = 0; i < originalR ; i++) {
                sum += result[arr[i]];
            }
            if(sum == s){
                cnt++;
            }
            return;
        } else if (target == n) {
            return;
        } else {
            arr[index] = target;
            combination(arr, n, r - 1, index + 1, target + 1, result, originalR, s);
            combination(arr, n, r, index, target + 1, result, originalR, s);
        }
    }
}
