package io.github.effectivedev.algorithm.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * DFS와 BFS
 * https://www.acmicpc.net/problem/fs
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-09-09 20:33
 */

public class DFS {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        ArrayList<Integer>[] arr = (ArrayList<Integer>[]) new ArrayList[N + 1];

        for (int i = 0; i <= N; i++) {
            arr[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());

            arr[n1].add(n2);
            arr[n2].add(n1);
        }
        DFS(arr, new boolean[arr.length + 1], V);
        System.out.println();
        BFS(arr, new boolean[arr.length + 1], V);


    }

    //DFS Recursive
    private static void DFS(ArrayList<Integer>[] arr, boolean[] isVisited, int v) {
        int n = arr.length - 1;
        isVisited[v] = true;
        System.out.print(v + " ");
        ArrayList<Integer> list = arr[v];
        list.sort(Integer::compareTo);
        for (int i = 0; i < list.size(); i++) {
            if (!isVisited[list.get(i)]) {
                DFS(arr, isVisited, list.get(i));
            }
        }
    }
    //BFS
    private static void BFS(ArrayList<Integer>[] arr, boolean[] isVisited, int v) {
        int n = arr.length - 1;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        isVisited[v] = true;
        System.out.print(v + " ");

        while (!queue.isEmpty()) {
            List<Integer> list = arr[queue.poll()];
            list.sort(Integer::compareTo);
            for (int i = 0; i < list.size(); i++) {
                Integer integer = list.get(i);
                if (!isVisited[integer]) {
                    queue.add(integer);
                    isVisited[integer] = true;
                    System.out.print(integer + " ");
                }
            }
        }
    }
}
