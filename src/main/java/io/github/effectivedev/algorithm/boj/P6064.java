package io.github.effectivedev.algorithm.boj;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * BOJ 6064 카잉달력
 * https://www.acmicpc.net/problem/6064
 * @author effectivedev
 */
public class P6064 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        while (cnt-- > 0) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            boolean hasSolution = false;
            for (int i = 0; i < m ; i++) {
                if((n*i+y-x) % m == 0){
                    hasSolution = true;
                    System.out.println(n*i+y);
                    break;
                }
            }
            if(!hasSolution){
                System.out.println("-1");
            }
        }
    }
}