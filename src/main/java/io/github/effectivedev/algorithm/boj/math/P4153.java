package io.github.effectivedev.algorithm.boj.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 직각삼각형
 * https://www.acmicpc.net/problem/4153
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-12 22:52
 */
public class P4153 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        StringBuilder sb = new StringBuilder();
        while((line=br.readLine()) != null){
            if("0 0 0".equals(line)){
                break;
            }
            String[] datas =line.split(" ");
            int a = Integer.parseInt(datas[0]);
            int b = Integer.parseInt(datas[1]);
            int c = Integer.parseInt(datas[2]);

            int[] x = {a, b, c};
            Arrays.sort(x);

            if(x[2]*x[2] == x[0]*x[0] + x[1]*x[1]){
                sb.append("right").append("\n");
            }else{
                sb.append("wrong").append("\n");
            }
        }
        System.out.println(sb);
    }
}