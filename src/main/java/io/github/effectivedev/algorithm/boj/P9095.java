package io.github.effectivedev.algorithm.boj;

import java.util.Scanner;

/**
 * BOJ 9095 1,2,3 더하기
 * https://www.acmicpc.net/problem/9095
 * @author effectivedev
 */
public class P9095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        for (int i = 0; i < cnt; i++) {
            int goal = sc.nextInt();
            System.out.println(go(0, goal));
        }
    }

    private static int go(int sum, int goal) {
        if (sum > goal) {
            return 0;
        }
        if (sum == goal) {
            return 1;
        }
        int now = 0;
        for (int i = 1; i <= 3; i++) {
            now += go(sum + i, goal);
        }
        return now;
    }
}
