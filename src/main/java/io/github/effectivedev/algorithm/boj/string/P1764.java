package io.github.effectivedev.algorithm.boj.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

/**
 * 듣보잡
 * https://www.acmicpc.net/problem/1764
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-21 14:03
 */

public class P1764 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Set<String> dSet = new HashSet<>();
        Set<String> bSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            dSet.add(br.readLine());
        }
        for (int i = 0; i < m; i++) {
            bSet.add(br.readLine());
        }
        //교집합
        dSet.retainAll(bSet);
        List<String> bdList = new ArrayList();
        int size = dSet.size();
        Iterator it = dSet.iterator();
        while(it.hasNext()){
            bdList.add((String) it.next());
        }
        System.out.println(size);
        Collections.sort(bdList);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(bdList.get(i)).append("\n");
        }
        System.out.println(sb);
    }
}
