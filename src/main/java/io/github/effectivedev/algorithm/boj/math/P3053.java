package io.github.effectivedev.algorithm.boj.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

/**
 * 택시 기하학
 * https://www.acmicpc.net/problem/3053
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-12 23:05
 */
public class P3053 {
    public static void main(String args[]) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        String data = br.readLine();
        double r= Double.parseDouble(data);
        System.out.println(r*r*Math.PI);
        System.out.println(r*r*2.0);
    }
}