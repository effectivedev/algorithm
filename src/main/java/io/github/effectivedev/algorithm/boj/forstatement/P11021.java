package io.github.effectivedev.algorithm.boj.forstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * A+B-7
 * https://www.acmicpc.net/problem/11021
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-09 11:05
 */

public class P11021 {
    private static final String CASE = "Case #";
    private static final String END = ": ";
    private static final String NEW_LINE = "\n";

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= cnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            sb.append(CASE).append(i).append(END)
                    .append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))
                    .append(NEW_LINE);
        }
        System.out.println(sb);
    }
}
