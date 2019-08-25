package io.github.effectivedev.algorithm.boj.math;

import java.util.Scanner;

/**
 * BOJ 1712 손익분기점
 * https://www.acmicpc.net/problem/1712
 * @author effectivedev
 */
public class P1712 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if (b >= c)
            System.out.print("-1");
        else
            System.out.print(a/(c-b)+1);
    }
}
