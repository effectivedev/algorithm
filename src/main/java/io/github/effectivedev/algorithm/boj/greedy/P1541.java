package io.github.effectivedev.algorithm.boj.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 잃어버린 괄호
 * https://www.acmicpc.net/problem/1541
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-09-02 12:21
 */

public class P1541 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] data = br.readLine().split("-");
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            String[] subData = data[i].split("\\+");
            int tempSum = 0;
            for (int j = 0; j < subData.length; j++) {
                tempSum += Integer.parseInt(subData[j]);
            }
            if(i==0){
                sum += tempSum;
            }else{
                sum -= tempSum;
            }
        }
        System.out.println(sum);
    }
}
