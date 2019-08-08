package io.github.effectivedev.algorithm.boj.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 정수 삼각형
 * https://www.acmicpc.net/problem/1932
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-08 16:10
 */
public class P1932 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int nums[][] = new int[cnt+1][cnt+1];
        int DP[][] = new int[cnt+1][cnt+1];

        for (int i = 0; i < cnt; i++) {
            String[] data = br.readLine().split(" ");
            for (int j = 0; j < data.length; j++) {
                nums[i][j] = Integer.parseInt(data[j]);
            }
        }
        //DP:현재 위치의 최대값
        DP[0][0] = nums[0][0];
        for (int i = 1; i < cnt; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (j == 0) { //바로위
                    DP[i][j] = DP[i - 1][j] + nums[i][j];
                } else if (j == i) { //대각선 왼쪽
                    DP[i][j] = DP[i - 1][j - 1] + nums[i][j];
                } else { //가운데
                    DP[i][j] = Math.max(DP[i - 1][j], DP[i - 1][j - 1]) + nums[i][j];
                }
            }
        }
        int max = DP[cnt - 1][0];
        for (int i = 1; i < cnt; i++) {
            int val = DP[cnt - 1][i];
            if (val > max){
                max = val;
            }
        }
        System.out.println(max);
    }
}
