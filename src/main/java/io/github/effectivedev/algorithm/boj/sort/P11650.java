package io.github.effectivedev.algorithm.boj.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 좌표 정렬하기
 * https://www.acmicpc.net/problem/11650
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-13 08:35
 */

public class P11650 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Map<Integer, Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] data = br.readLine().split(" ");
            Map<Integer, Integer> map = new HashMap<>();
            int a = Integer.parseInt(data[0]);
            int b = Integer.parseInt(data[1]);
            map.put(a, b);
            list.add(map);
        }
        Collections.sort(list, new Comparator<Map<Integer, Integer>>() {
            @Override
            public int compare(Map<Integer, Integer> o1, Map<Integer, Integer> o2) {
                int a = 0;
                int aV = 0;
                int b = 0;
                int bV = 0;
                for (Integer k : o1.keySet()) {
                    a = k;
                    aV = o1.get(k);
                }
                for (Integer k : o2.keySet()) {
                    b = k;
                    bV = o2.get(k);
                }
                if (a - b > 0) {
                    return 1;
                } else {
                    if (a == b) {
                        if (aV - bV > 0) {
                            return 1;
                        } else {
                            return -1;
                        }
                    } else {
                        return -1;
                    }
                }
            }
        });
        StringBuilder sb = new StringBuilder();
        for (Map<Integer, Integer> map :
                list) {
            for (Integer k : map.keySet()) {
                sb.append(k);
                sb.append(" ");
                sb.append(map.get(k));
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}
