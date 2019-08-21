package io.github.effectivedev.algorithm.boj.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 5와 6의 차이
 * https://www.acmicpc.net/problem/2864
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-21 15:50
 */

public class P2864 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String a = st.nextToken();
        String b = st.nextToken();
        String a6 = a.replaceAll("5", "6");
        String b6 = b.replaceAll("5", "6");
        String a5 = a.replaceAll("6", "5");
        String b5 = b.replaceAll("6", "5");

        System.out.println(Integer.parseInt(a5)+Integer.parseInt(b5));
        System.out.println(Integer.parseInt(a6)+Integer.parseInt(b6));
    }
}
