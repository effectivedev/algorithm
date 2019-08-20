package io.github.effectivedev.algorithm.boj.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 2×n 타일링
 * https://www.acmicpc.net/problem/11726
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-20 23:53
 */

public class P11726 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        //2×n 크기의 직사각형을 채우는 방법의 수
        int[]DP = new int[T+1];
        DP[0] = 1;
        DP[1] = 1;
        for (int i = 2; i <= T; i++) {
            DP[i] = DP[i-1]%10007+DP[i-2]%10007;
        }
        System.out.println(DP[T]%10007);
    }
}
