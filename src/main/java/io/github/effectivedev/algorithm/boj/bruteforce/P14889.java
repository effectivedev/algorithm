package io.github.effectivedev.algorithm.boj.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * 스타트와 링크
 * https://www.acmicpc.net/problem/14889
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 05/09/2019 9:07 오전
 */

public class P14889 {
    static int min = Integer.MAX_VALUE;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] result = new int[n][n];
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                result[i][j] = Integer.parseInt(st.nextToken());
            }
        };
        combination(new int[n], n, n / 2, 0, 0, result);
        System.out.println(min);
    }

    private static void combination(int[] arr, int n, int r, int index, int target, int[][] result) {
        if (r == 0) {
            simulate(arr, n, result);
            return;
        } else if (n == target) {
            return;
        } else {
            arr[index] = target;
            combination(arr, n, r - 1, index + 1, target + 1, result);
            combination(arr, n, r, index, target + 1, result);
        }
    }

    private static void simulate(int[] arr, int n, int[][] result) {
        Set<Integer> teamOne = new HashSet<>();
        for (int i = 0; i < n/2; i++) {
            teamOne.add(arr[i]);
        }
        Set<Integer> teamTwo = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if(!teamOne.contains(i)){
                teamTwo.add(i);
            }
        }
        int sumOne = 0;
        int sumTwo = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    if(teamOne.contains(i) && teamOne.contains(j)){
                        sumOne += result[i][j];
                    }else if(teamTwo.contains(i) && teamTwo.contains(j)){
                        sumTwo += result[i][j];
                    }
                }
            }
        }
        min = Math.min(Math.abs(sumOne-sumTwo), min);
    }
}
