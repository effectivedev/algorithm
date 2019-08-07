package io.github.effectivedev.algorithm.boj.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 체스판 다시 칠하기
 * https://www.acmicpc.net/problem/1018
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-07 09:29
 */
public class P1018 {
    private static final String B = "B";
    private static final String W = "W";
    private static String[][] bChess = new String[8][8];
    private static String[][] wChess = new String[8][8];

    static {
        int cnt = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        wChess[i][j] = W;
                        bChess[i][j] = B;
                    } else {
                        wChess[i][j] = B;
                        bChess[i][j] = W;
                    }
                } else {
                    if (j % 2 == 0) {
                        wChess[i][j] = B;
                        bChess[i][j] = W;
                    } else {
                        wChess[i][j] = W;
                        bChess[i][j] = B;
                    }
                }
            }
        }
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        //체스 값세팅
        String[][] chess = new String[m][n];
        for (int i = 0; i < m; i++) {
            String line = br.readLine();
            for (int j = 0; j < n; j++) {
                chess[i][j] = String.valueOf(line.charAt(j));
            }
        }

        //카운트 체크
        List<Integer> changeCountList = new ArrayList<>();
        for (int i = 0; i <= m - 8; i++) {
            for (int j = 0; j <= n - 8; j++) {
                changeCountList.add(changeCount(chess, i, j));
            }
        }

        //카운트 최소값 출력
        int min = changeCountList.get(0);
        for (int i = 1; i < changeCountList.size() ; i++) {
            int count = changeCountList.get(i);
            if(count < min){
                min = count;
            }
        }
        System.out.println(min);
    }

    private static Integer changeCount(String[][] chess, int mPosition, int nPosition) {
        int wCnt = 0;
        int bCnt = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                String color = chess[i + mPosition][j + nPosition];

                if (!color.equals(bChess[i][j])) {
                    bCnt++;
                }
                if (!color.equals(wChess[i][j])) {
                    wCnt++;
                }
            }
        }
        return Math.min(bCnt, wCnt);
    }

    private static void printChess(String[][] chess) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(chess[i][j]);
            }
            System.out.println("");
        }
    }
}
