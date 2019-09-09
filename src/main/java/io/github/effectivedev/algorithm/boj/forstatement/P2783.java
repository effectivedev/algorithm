package io.github.effectivedev.algorithm.boj.forstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.StringTokenizer;

/**
 * 삼각 김밥
 * https://www.acmicpc.net/problem/2783
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 09/09/2019 3:03 오후
 */

public class P2783 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        double x0 = Double.parseDouble(st.nextToken());
        double y0 = Double.parseDouble(st.nextToken());

        int T = Integer.parseInt(br.readLine());
        double[] x = new double[T + 1];
        double[] y = new double[T + 1];
        x[0] = x0;
        y[0] = y0;

        for (int i = 1; i <= T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            x[i] = Double.parseDouble(st.nextToken());
            y[i] = Double.parseDouble(st.nextToken());
        }
        double min = Integer.MAX_VALUE;
        for (int i = 0; i < T+1; i++) {
           double val=  x[i] /y[i] * 1000;
           if(min > val){
               min = val;
           }
        }
        System.out.printf("%.2f", min);
    }
}
