package io.github.effectivedev.algorithm.boj.ifstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 윤년
 * https://www.acmicpc.net/problem/2753
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-09 09:11
 */
public class P2753 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a= Integer.parseInt(br.readLine());
        if ((a % 4) == 0 && ((a %100)!=0 || (a%400) ==0)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
