package io.github.effectivedev.algorithm.boj.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 네 번째 점
 * https://www.acmicpc.net/problem/3009
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-12 21:04
 */
public class P3009 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] p1 = br.readLine().split(" ");
        String[] p2 = br.readLine().split(" ");
        String[] p3 = br.readLine().split(" ");

        int x1 = Integer.parseInt(p1[0]);
        int y1 = Integer.parseInt(p1[1]);
        int x2 = Integer.parseInt(p2[0]);
        int y2 = Integer.parseInt(p2[1]);
        int x3 = Integer.parseInt(p3[0]);
        int y3 = Integer.parseInt(p3[1]);

        int maxX = Math.max(Math.max(x1, x2),x3);
        int minX = Math.min(Math.min(x1, x2),x3);
        int maxY = Math.max(Math.max(y1, y2),y3);
        int minY = Math.min(Math.min(y1, y2),y3);

        int xMaxCnt = getMaxCnt(x1, x2, x3, maxX);
        int yMaxCnt = getMaxCnt(y1, y2, y3, maxY);
        System.out.printf("%d %d\n",xMaxCnt==2? minX:maxX, yMaxCnt==2? minY:maxY);
    }

    public static int getMaxCnt(int a, int b, int c, int max) {
        int cnt = 0;
        if (a == max) {
            cnt++;
        }
        if (b == max) {
            cnt++;
        }
        if (c == max) {
            cnt++;
        }
        return cnt;
    }
}