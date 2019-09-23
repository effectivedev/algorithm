package io.github.effectivedev.algorithm.boj.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 싱기한 네가지 숫자
 * https://www.acmicpc.net/problem/6679
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 23/09/2019 10:44 오전
 */

public class P6679 {
    public static void main(String args[]) throws IOException {
        for (int i = 1000; i <= 9999; i++) {
            if(checkNum(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean checkNum(int num) {
        int sumOf10 = sum(num, 10);
        int sumOf12 = sum(num, 12);
        int sumOf16 = sum(num, 16);
        if (sumOf10 == sumOf12 && sumOf12 == sumOf16) {
            return true;
        }
        return false;
    }

    private static int sum(int num, int divider) {
        int sum = 0;
        int cnt = 0;
        while (num != 0) {
            int remain = num % divider;
            sum += remain;
            num = num / divider;
        }
        return sum;
    }
}
