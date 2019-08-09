package io.github.effectivedev.algorithm.boj.forstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * A+B-8
 * https://www.acmicpc.net/problem/11022
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-09 11:18
 */

public class P11022 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data = br.readLine();
        int T = Integer.parseInt(data);
        int a, b;
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            sb.append("Case #").append(i).append(": ").append(a).append(" + ").append(b).append(" = ").append(a + b).append("\n");
        }
        System.out.println(sb);
        br.close();
    }

}
