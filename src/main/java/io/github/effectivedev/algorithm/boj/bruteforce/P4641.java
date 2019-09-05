package io.github.effectivedev.algorithm.boj.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

/**
 * Doubles
 * https://www.acmicpc.net/problem/4641
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 05/09/2019 2:32 오후
 */

public class P4641 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data;
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        while ((data = br.readLine()) != null) {
            if ("-1".equals(data)) {
                break;
            }
            st = new StringTokenizer(data);
            List<Integer> list = new ArrayList<>();
            while (st.hasMoreTokens()) {
                String val = st.nextToken();
                if (!"0".equals(val)) {
                    list.add(Integer.parseInt(val));
                }
            }
            cnt = 0;
            List<Integer> doubleList = list.stream().mapToInt(i -> 2*i).boxed().collect(Collectors.toList());
            for (int i = 0; i <doubleList.size(); i++) {
                for (int j = 0; j < list.size(); j++) {
                    if(i !=j){
                        if(doubleList.get(i) == list.get(j)){
                            cnt++;
                            break;
                        }
                    }
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.print(sb);
    }
}
