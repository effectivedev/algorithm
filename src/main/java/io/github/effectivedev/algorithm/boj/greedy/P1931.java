package io.github.effectivedev.algorithm.boj.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

/**
 * 회의실배정
 * https://www.acmicpc.net/problem/1931
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-29 23:08
 */

public class P1931 {
    static int cnt = 0;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        Conference[] conferences = new Conference[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            conferences[i] = new Conference();
            conferences[i].start = Integer.parseInt(st.nextToken());
            conferences[i].end = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(conferences, new Comparator<Conference>() {
            @Override
            public int compare(Conference o1, Conference o2) {
                if (o1.end > o2.end) {
                    return 1;
                } else if (o1.end == o2.end) {
                    if (o1.start > o2.start) {
                        return 1;
                    } else if (o1.start == o2.start) {
                        return 0;
                    } else
                        return -1;
                } else {
                    return -1;
                }
            }
        });
        go(conferences[0].start, conferences[0].end, conferences, 0);
        System.out.println(cnt);

    }

    private static void go(int start, int end, Conference[] conferences, int index) {
        cnt++;
        if (index != conferences.length - 1) {
            for (int i = index + 1; i < conferences.length; i++) {
                if (conferences[i].start >= end) {
                    go(conferences[i].start, conferences[i].end, conferences, i);
                    break;
                }
            }
        }
    }

    static class Conference {
        int start;
        int end;

        @Override
        public String toString() {
            return "Conference{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }
    }
}
