package io.github.effectivedev.algorithm.boj.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

/**
 * 가르침
 * https://www.acmicpc.net/problem/1062
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-23 11:16
 */

public class P1062 {
    static List<List<Integer>> simulateList = new ArrayList<>();
    static List<List<Integer>> distinctWordList = new ArrayList<>();

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Set<Integer> distinctChar = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            List<Integer> distinctList = new ArrayList<>();
            List<Integer> dList = line.chars().filter(w -> (char) w != 'a' && (char) w != 'c' && (char) w != 'i' && (char) w != 'n' && (char) w != 't').distinct().boxed().collect(Collectors.toList());
            distinctWordList.add(dList);
            dList.stream().forEach(distinctChar::add);
        }
        int size = distinctChar.size();
        int[] combArr = new int[size];
        if (size < k - 5) {
            System.out.println(n);
        } else {
            combination(combArr, size, k - 5, 0, 0, distinctChar.stream().mapToInt(Number::intValue).toArray());
            int maxCount = 0;
            System.out.println(getMaxCnt(distinctWordList, maxCount));
        }

    }

    private static int getMaxCnt(List<List<Integer>> distinctList, int maxCnt) {
        for (int i = 0; i < simulateList.size(); i++) {
            List<Integer> data = simulateList.get(i);
            int cnt = 0;
            for (int j = 0; j < distinctList.size(); j++) {
                if (data.containsAll(distinctList.get(j))|| distinctList.size() == 0){
                    cnt++;
                }
            }
            if (cnt > maxCnt) {
                maxCnt = cnt;
            }
        }
        return maxCnt;
    }

    public static void combination(int[] combArr, int n, int r, int index, int target, int[] arr) {
        if (r == 0) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < index; i++) {
                list.add(arr[combArr[i]]);
            }
            simulateList.add(list);
        } else if (target == n) return;
        else {
            combArr[index] = target;
            combination(combArr, n, r - 1, index + 1, target + 1, arr); // (i)
            combination(combArr, n, r, index, target + 1, arr); //(ii)
        }
    }
}
