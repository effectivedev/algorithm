package io.github.effectivedev.algorithm.boj.dnc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 색종이 만들기
 * https://www.acmicpc.net/problem/2630
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 01/10/2019 11:07 오전
 */

public class P2630 {
    static int[][] QT;
    static int blueCnt = 0;
    static int whiteCnt = 0;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        QT = new int[N][N];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                QT[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        cut(0, 0, N);
        System.out.println(whiteCnt);
        System.out.println(blueCnt);
    }

    private static void cut(int r, int c, int chunk) {
        if (checkValue(r, c, chunk)) {
            if (QT[r][c] == 1) {
                blueCnt++;
            } else {
                whiteCnt++;
            }
        } else {
            int half = chunk / 2;
            cut(r, c, half);
            cut(r, c + half, half);
            cut(r + half, c, half);
            cut(r + half, c + half, half);
        }
    }

    private static boolean checkValue(int r, int c, int chunk) {
        int val = QT[r][c];
        for (int i = r; i < r + chunk; i++) {
            for (int j = c; j < c + chunk; j++) {
                if (val != QT[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
