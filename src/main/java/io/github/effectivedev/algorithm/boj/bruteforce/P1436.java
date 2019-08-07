package io.github.effectivedev.algorithm.boj.bruteforce;

import java.io.*;

/**
 * 영화감독 숌
 * https://www.acmicpc.net/problem/1436
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-07 12:54
 */
public class P1436 {
    public static void main(String args[]) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
            int n = Integer.parseInt(br.readLine());
            int endCnt = 0;
            int i = 666, temp = 0;
            while (true) {
                temp = i;
                while (temp >= 666) {
                    if (temp % 10 == 6 && ((temp / 10) % 10 == 6) && ((temp / 100) % 10) == 6) {
                        endCnt++;
                        break;
                    }
                    temp /= 10;
                }
                if (endCnt == n) {
                    bw.write(String.valueOf(i));
                    bw.close();
                    break;
                }
                i++;
            }
        }
    }
}
