package io.github.effectivedev.algorithm.boj.whilestatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * A+B - 5
 * https://www.acmicpc.net/problem/10952
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-09 11:30
 */

public class P10952 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String[] arr= br.readLine().split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            if(a==0 && b==0){
                break;
            }
            sb.append(a+b).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
