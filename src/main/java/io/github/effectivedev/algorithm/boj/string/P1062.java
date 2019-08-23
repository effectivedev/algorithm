package io.github.effectivedev.algorithm.boj.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 가르침
 * https://www.acmicpc.net/problem/1062
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-23 11:16
 */

public class P1062 {
    static List<List> simulateList = new ArrayList<>();
    static List<String> wordList = new ArrayList<>();
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Set<Character> distinctChar = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            wordList.add(line);
            int length = line.length();
            for (int j = 0; j < length; j++) {
                distinctChar.add(line.charAt(j));
            }
        }
        System.out.println(distinctChar);
        int size = distinctChar.size();
        boolean[] visited = new boolean[size];
        int cnt = 0;
        char[] distinctCharArr = new char[size];
        for (char c : distinctChar) {
            distinctCharArr[cnt++] = c;
        }
        int maxCount = 0;
        combination(distinctCharArr, visited, 0, size, k);
//        System.out.println(getMaxCnt(simulateList, maxCount));
        System.out.println(wordList.get(0));
        System.out.println(simulateList.get(0));
        System.out.println(wordList.containsAll(simulateList));
    }

    private static int getMaxCnt(List<List> list, int maxCnt) {
        for (int i = 0; i < simulateList.size(); i++) {
            List s = simulateList.get(i);
            int cnt = 0;
            for (int j = 0; j < wordList.size(); j++) {
                if (s.contains(wordList.get(j))) {
                    cnt++;
                }
            }
            if (cnt > maxCnt) {
                maxCnt = cnt;
            }
        }
        return maxCnt;
    }

    private static void combination(char[] arr, boolean[] visited, int start, int n, int r) {
        if (r == 0) {
            getSimulateData(arr, visited, n);
            return;
        } else {
            for (int i = start; i < n; i++) {
                visited[i] = true;
                combination(arr, visited, i + 1, n, r - 1);
                visited[i] = false;
            }
        }
    }

    // 배열 출력
    private static void getSimulateData(char[] arr, boolean[] visited, int n) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (visited[i] == true)
                list.add(arr[i]);
        }
        simulateList.add(list);
    }
}
