package io.github.effectivedev.algorithm.boj.ioarithmetic;

import java.io.*;

/**
 * 곱셈
 * https://www.acmicpc.net/problem/2588
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-09 08:18
 */
public class P2588 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.valueOf(br.readLine());
        int b = Integer.valueOf(br.readLine());
        System.out.println(a * (b % 10) );
        System.out.println(a * (b / 10 % 10));
        System.out.println(a * (b / 100));
        System.out.println(a * b);
//            int sum = 0;
//            int i = 0;
//
//            while (b != 0) {
//                int r = b % 10;
//                int c = a * r;
//                bw.write(c + "\n");
//                sum += c * (int) Math.pow(10, i);
//                b /= 10;
//                i++;
//            }
//            bw.write(sum + "\n");
    }
}

