package io.github.effectivedev.algorithm.boj.function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 별 찍기 - 10
 * https://www.acmicpc.net/problem/2447
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-09 16:33
 */

public class P2447 {
    static StringBuilder sb = new StringBuilder();
    static StringBuilder sb2 = new StringBuilder();
    static StringBuilder sb3 = new StringBuilder();
    static {
        sb.append("***************************\n").append("* ** ** ** ** ** ** ** ** *\n").append("***************************");

        sb2.append(sb);
        sb2.append("\n***   ******   ******   ***\n").append("* *   * ** *   * ** *   * *\n").append("***   ******   " +
                "******   ***\n").append("***************************\n").append("* ** ** ** ** ** ** ** ** *\n").append("***************************");

        sb3.append(sb2);
        sb3.append("\n*********         *********\n").append("* ** ** *         * ** ** *\n").append("*********      " +
                "   *********\n").append("***   ***         ***   ***\n").append("* *   * *         * *   * *\n").append("***   ***         ***   ***\n").append("*********         *********\n").append("* ** ** *         * ** ** *\n").append("*********         *********");
        sb3.append("\n");
        sb3.append(sb);
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        getStar(n);
    }

    private static void getStar(int n) {
        StringBuilder result = new StringBuilder();
        if (n % 27 == 0) {
            for (int i = 0, len = n / 27; i < len; i++) {
                result.append(sb3).append("\n");
            }
            n = n / 27;
        }
        if (n % 9 == 0) {
            for (int i = 0, len = n / 9; i < len; i++) {
                result.append(sb2).append("\n");
            }
            n = n / 9;
        }
        if (n % 3 == 0) {
            for (int i = 0, len = n / 3; i < len; i++) {
                result.append(sb).append("\n");
            }
            n = n / 3;
        }
        System.out.println(result);
    }
}
