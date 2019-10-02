package io.github.effectivedev.algorithm.boj.dnc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 쿼드 트리
 * https://www.acmicpc.net/problem/6580
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 01/10/2019 2:52 오후
 */

public class P6580 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        st.nextToken();
        st.nextToken();
        int N = Integer.parseInt(st.nextToken());
        br.readLine();
        br.readLine();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String[] quadtree_bits = br.readLine().split(",");
            sb.append(Arrays.toString(quadtree_bits));
            sb.append("\n");
        }
        br.readLine();
        System.out.print(sb);

    }
}
