package io.github.effectivedev.algorithm.boj.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 수 정렬하기
 * https://www.acmicpc.net/problem/2750
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-07 14:33
 */
public class P2750 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int[] numArr = new int[cnt];
        int i = 0;
        while (cnt-- > 0) {
            numArr[i] = Integer.parseInt(br.readLine());
            i++;
        }
        br.close();
        Arrays.sort(numArr);
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < numArr.length; j++) {
            sb.append(numArr[j]).append("\n");
        }
        System.out.print(sb.toString());
    }
}
