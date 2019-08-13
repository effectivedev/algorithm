package io.github.effectivedev.algorithm.boj.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 터렛
 * https://www.acmicpc.net/problem/1002
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-12 23:56
 */
public class P1002 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            String[] lines = br.readLine().split(" ");
            int x1 = Integer.parseInt(lines[0]);
            int y1 = Integer.parseInt(lines[1]);
            int r1 = Integer.parseInt(lines[2]);
            int x2 = Integer.parseInt(lines[3]);
            int y2 = Integer.parseInt(lines[4]);
            int r2 = Integer.parseInt(lines[5]);

            int temp = 0;
            if(r1< r2){
                temp = r1;
                r1 = r2;
                r2 = temp;
            }
            //두 점 사이의 거리
            double d = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
            //두 점이 일치할 경우
            if ((x1 == x2) && (y1 == y2)) {
                //반지름까지 일치 => 무한대
                if (r1 == r2) {
                    sb.append("-1").append("\n");
                } else {
                    sb.append("0").append("\n");
                }
            } else {
                //두 원이 접하지 않을 때
                if (r1 + r2 < d) {
                    sb.append("0").append("\n");
                }//외접 할때
                else if (r1 + r2 == d) {
                    sb.append("1").append("\n");
                }
                //두점에서 만날때
                else if (r1 - r2 < d && d < r1 + r2) {
                    sb.append("2").append("\n");
                }
                //내접할 때
                else if (r1 - r2 ==d) {
                    sb.append("1").append("\n");
                }
                //내부에 있으면서 두원이 접하지 않을 때
                else if (r1 - r2 > d) {
                    sb.append("0").append("\n");
                }
            }

        }
        System.out.println(sb);

    }
}