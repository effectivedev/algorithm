package io.github.effectivedev.algorithm.boj;

import java.util.Scanner;

public class P2869 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextInt();
        double v = sc.nextInt();

        System.out.println((int)(Math.ceil((v-a)/(a-b))+1));
    }
}
