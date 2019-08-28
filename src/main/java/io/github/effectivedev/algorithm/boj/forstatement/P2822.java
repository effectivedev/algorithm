package io.github.effectivedev.algorithm.boj.forstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 점수 계산
 * https://www.acmicpc.net/problem/2822
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-27 17:54
 */

public class P2822 {
    static int max = 0;
    static int cnt = 0;
    static List<String> list = new ArrayList<>();

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] point = new int[8];
        int sum = 0;
        for (int i = 0; i < 8; i++) {
            point[i] = Integer.parseInt(br.readLine());
            sum += point[i];
        }
        br.close();
        int[] arr = new int[8];
        combination(arr, 8, 5, 0, 0, point);
        System.out.println(max);
        System.out.println(list.get(list.size() - 1));
    }

    private static void combination(int[] arr, int n, int r, int index, int target, int[] point) {
        if (r == 0) {
            int sum = 0;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 5; i++) {
                sum += point[arr[i]];
                sb.append(arr[i] + 1).append(" ");
            }
            max = Math.max(sum, max);
            if (max == sum) {
                list.add(sb.toString());
            }
        } else if (target == n) {
            return;
        } else {
            arr[index] = target;
            combination(arr, n, r - 1, index + 1, target + 1, point);
            combination(arr, n, r, index, target + 1, point);
        }

    }
}
