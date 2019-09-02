package io.github.effectivedev.algorithm.boj.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 기타줄
 * https://www.acmicpc.net/problem/1049
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-09-02 13:32
 */

public class P1049 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] data = br.readLine().split(" ");
        int n = Integer.parseInt(data[0]);
        int m = Integer.parseInt(data[1]);

        int minByOne = 1001;
        int minBySix = 1001;
        for (int i = 0; i < m; i++) {
            String[]brand =br.readLine().split(" ");
            minBySix = Math.min(minBySix, Integer.parseInt(brand[0]));
            minByOne = Math.min(minByOne, Integer.parseInt(brand[1]));
        }
        int total = 0;
        if(minBySix < minByOne*6){
            total += minBySix*(n/6);
            total += Math.min(minBySix, minByOne*(n%6));
        }else{
            total = minByOne*n;
        }
        System.out.println(total);
    }
}
