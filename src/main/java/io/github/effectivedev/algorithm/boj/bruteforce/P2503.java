package io.github.effectivedev.algorithm.boj.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 숫자 야구
 * https://www.acmicpc.net/problem/2503
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 04/09/2019 4:51 오후
 */

public class P2503 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        List<BaseBallGame> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            list.add(new BaseBallGame(Arrays.stream(st.nextToken().split("")).mapToInt(Integer::parseInt).toArray(),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken())));
        }
        int cnt = 0;

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (i == j) {
                    continue;
                }
                for (int k = 1; k < 10; k++) {
                    if (i == k || j == k) {
                        continue;
                    }
                    int simul[] = new int[]{i, j, k};
                    boolean isOk = true;
                    for (int l = 0; l < list.size(); l++) {
                        BaseBallGame bg = list.get(l);
                        int strikeCnt = 0;
                        int ballCnt = 0;
                        for (int m = 0; m < 3; m++) {
                            for (int o = 0; o < 3; o++) {
                                if (bg.num[m] == simul[o]) {
                                    if (m == o) {
                                        strikeCnt++;
                                    } else {
                                        ballCnt++;
                                    }
                                }
                            }
                        }
                        if (bg.strike != strikeCnt || bg.ball != ballCnt) {
                            isOk = false;
                            break;
                        }
                    }
                    if (isOk) {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }

    static class BaseBallGame {
        int[] num;
        int strike;
        int ball;

        public BaseBallGame(int[] num, int strike, int ball) {
            this.num = num;
            this.strike = strike;
            this.ball = ball;
        }
    }
}
