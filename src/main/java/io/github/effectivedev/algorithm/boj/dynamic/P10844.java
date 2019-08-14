package io.github.effectivedev.algorithm.boj.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

/**
 * 쉬운 계단 수
 *
 * 45656이란 수를 보자.
 * 이 수는 인접한 모든 자리수의 차이가 1이 난다. 이런 수를 계단 수라고 한다.
 * 세준이는 수의 길이가 N인 계단 수가 몇 개 있는지 궁금해졌다.
 * N이 주어질 때, 길이가 N인 계단 수가 총 몇 개 있는지 구하는 프로그램을 작성하시오. (0으로 시작하는 수는 없다.)  1 -> 9 , 2-> 17
 *
 * 입력 : 첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 100보다 작거나 같은 자연수이다.
 * 출력 : 첫째 줄에 정답을 1,000,000,000으로 나눈 나머지를 출력한다.
 *
 * https://www.acmicpc.net/problem/10844
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-14 13:54
 */

public class P10844 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] DP = new int[n+1][10];
        for (int j = 1; j < 10; j++) {
            DP[1][j] =1;
        }
        for (int i = 2; i <=n ; i++) {
            for (int j = 0; j < 10; j++) {
                if(j == 0){
                    DP[i][j] = DP[i-1][1];
                }
                else if(j == 9){
                    DP[i][j] = DP[i-1][8];
                }else{
                    DP[i][j] = (DP[i-1][j-1] + DP[i-1][j+1]);
                }
                DP[i][j] = DP[i][j]%1000000000;
            }
        }
        int sum =0;
        for (int i = 0; i < 10; i++) {
            sum = (sum+DP[n][i])% 1000000000;
        }
        System.out.println(sum);
    }
    private static void printDP(int n, int[][] DP) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n ; i++) {
            sb.append(i + " : ");
            for (int j = 0; j < 10; j++) {
                sb.append(DP[i][j]+ " ");
            }
           sb.append("\n");
        }
        System.out.println(sb);
    }
}
