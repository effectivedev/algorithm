package io.github.effectivedev.algorithm.boj.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 종이자르기
 * https://www.acmicpc.net/problem/2628
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 28/08/2019 12:31 오전
 */

public class P2628 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        List<Integer> xList = new ArrayList<>();
        List<Integer> yList = new ArrayList<>();
        xList.add(0);
        yList.add(0);
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int type = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());

            if (type == 0) {
                yList.add(value);
            } else {
                xList.add(value);
            }
        }
        xList.add(x);
        yList.add(y);
        Collections.sort(xList);
        Collections.sort(yList);
        int maxX = 0;
        for (int i = 0; i < xList.size()-1; i++) {
            int gap = xList.get(i+1)-xList.get(i);
            maxX = Math.max(gap, maxX);
        }
        int maxY = 0;
        for (int i = 0; i < yList.size()-1; i++) {
            int gap = yList.get(i+1)-yList.get(i);
            maxY = Math.max(gap, maxY);
        }
        System.out.println(maxX*maxY);

    }
}
