package io.github.effectivedev.algorithm.boj;

import java.util.Scanner;

/**
 * BOJ 2869 달팽이는 올라가고 싶었다.
 * https://www.acmicpc.net/problem/1712
 * @author effectivedev
 */
public class P2869 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextInt();
        double v = sc.nextInt();

        System.out.println((int)(Math.ceil((v-a)/(a-b))+1));
    }
}
