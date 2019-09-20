package io.github.effectivedev.algorithm.boj.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 스도쿠
 * https://www.acmicpc.net/problem/2580
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 20/09/2019 9:08 오전
 */

public class P2580 {
    static int[][] SUDOKU = new int[9][9];
    static List<Zero> list = new ArrayList<>();
    static boolean hasSolution = false;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int zeroCnt = 0;
        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                SUDOKU[i][j] = Integer.parseInt(st.nextToken());
                if (SUDOKU[i][j] == 0) {
                    list.add(new Zero(i, j));
                }
            }
        }
        dfs(0);
    }

    private static boolean isPossible(int r, int c, int num) {
        if (findRow(r, num) && findCol(c, num) && findBox(r, c, num)) {
            return true;
        }else{
            return false;
        }
    }

    private static boolean findRow(int r, int num) {
        for (int j = 0; j < 9; j++) {
            if (SUDOKU[r][j] == num) {
                return false;
            }
        }
        return true;
    }

    private static boolean findCol(int c, int num) {
        for (int i = 0; i < 9; i++) {
            if (SUDOKU[i][c] == num) {
                return false;
            }
        }
        return true;
    }

    private static boolean findBox(int r, int c, int num) {
        int x = r / 3 * 3;
        int y = c / 3 * 3;
        for (int i = x; i < x + 3; i++) {
            for (int j = y; j < y + 3; j++) {
                if (SUDOKU[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void dfs(int depth) {
        if (depth == list.size()) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    sb.append(SUDOKU[i][j] + " ");
                }
                sb.append("\n");
            }
            System.out.print(sb.toString());
            System.exit(0);
            return;
        }
        else{
            int m = list.get(depth).row;
            int n = list.get(depth).col;
            for (int num = 1; num <= 9; num++) {
                if (isPossible(m, n, num)) {
                    SUDOKU[m][n] = num;
                    dfs(depth + 1);
                    SUDOKU[m][n] = 0;
                }
            }
        }
    }

    private static class Zero {
        int row;
        int col;

        public Zero(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
}
