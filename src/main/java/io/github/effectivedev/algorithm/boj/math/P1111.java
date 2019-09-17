package io.github.effectivedev.algorithm.boj.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * IQ Test
 * https://www.acmicpc.net/problem/1111
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 17/09/2019 3:50 오후
 */

public class P1111 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        if (N == 1) {
            System.out.println("A");
            return;
        } else if (N == 2) {
            if (arr[0] == arr[1]) {
                System.out.println(arr[0]);
            } else {
                System.out.println("A");
            }
        } else {
            boolean isOk = true;
            if (arr[0] == arr[1]) {
                for (int i = 1; i < arr.length - 1; i++) {
                    if (arr[i] != arr[i + 1]) {
                        isOk = false;
                    }
                }
                if (isOk) {
                    System.out.println(arr[0]);
                } else {
                    System.out.println("B");
                }
            } else {
                int a = (arr[2] - arr[1]) / (arr[1] - arr[0]);
                int b = arr[1] - arr[0] * a;
                isOk = true;
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] != arr[i - 1] * a + b) {
                        isOk = false;
                        break;
                    }
                }
                if (isOk) {
                    System.out.println(a * arr[N - 1] + b);
                } else {
                    System.out.println("B");
                }
            }
        }
    }
}
