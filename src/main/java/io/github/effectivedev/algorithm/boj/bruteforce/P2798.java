package io.github.effectivedev.algorithm.boj.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * BOJ 2798 블랙잭
 * https://www.acmicpc.net/problem/2798
 *
 * @author effectivedev
 */
public class P2798 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] fLine = br.readLine().split("\\s");
        int n = Integer.parseInt(fLine[0]);
        int m = Integer.parseInt(fLine[1]);

        String[] sLine = br.readLine().split("\\s");
        int[] cards = new int[n];

        for (int i = 0; i < n; i++) {
            cards[i] = Integer.parseInt(sLine[i]);
        }
        Arrays.sort(cards);
        int length = sLine.length;
        int max = -1;
        for (int i = 0; i < length - 2; i++) {
            for (int j = i + 1; j < length - 1; j++) {
                for (int k = j + 1; k < length; k++) {
                    if (cards[i] - 2 > m) {
                        break;
                    }
                    int sum = cards[i] + cards[j] + cards[k];
                    if (sum >= max && sum <= m) {
                        max = sum;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
