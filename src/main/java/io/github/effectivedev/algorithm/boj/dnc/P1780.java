package io.github.effectivedev.algorithm.boj.dnc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 종이의 개수
 * https://www.acmicpc.net/problem/1780
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 01/10/2019 11:07 오전
 */

public class P1780 {
    static int[][] NT;
    static int oneCnt = 0;
    static int zeroCnt = 0;
    static int minusOneCnt = 0;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        NT = new int[N][N];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                NT[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        cut(0, 0, N);
        System.out.println(minusOneCnt);
        System.out.println(zeroCnt);
        System.out.println(oneCnt);
    }

    private static void cut(int r, int c, int chunk) {
        if (checkValue(r, c, chunk)) {
            int currentValue = NT[r][c];
            if (currentValue == 1) {
                oneCnt++;
            } else if (currentValue == 0) {
                zeroCnt++;
            } else {
                minusOneCnt++;
            }
        } else {
            int oneOfThree = chunk / 3;
            int twoOfThree = chunk * 2 / 3;
            cut(r, c, oneOfThree);
            cut(r, c+oneOfThree, oneOfThree);
            cut(r, c+twoOfThree, oneOfThree);
            cut(r+oneOfThree, c, oneOfThree);
            cut(r+oneOfThree, c+oneOfThree, oneOfThree);
            cut(r+oneOfThree, c+twoOfThree, oneOfThree);
            cut(r+twoOfThree, c, oneOfThree);
            cut(r+twoOfThree, c+oneOfThree, oneOfThree);
            cut(r+twoOfThree, c+twoOfThree, oneOfThree);
        }
    }

    private static boolean checkValue(int r, int c, int chunk) {
        int val = NT[r][c];
        for (int i = r; i < r + chunk; i++) {
            for (int j = c; j < c + chunk; j++) {
                if (val != NT[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
