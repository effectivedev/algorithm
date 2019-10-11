package io.github.effectivedev.algorithm.boj.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 오르막길
 * https://www.acmicpc.net/problem/2846
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 24/09/2019 10:44 오전
 */

public class P2846 {
    static int N;
    static int[] arr;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[N];
        
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int max = 0;
        for (int i = 0; i < N; i++) {
            max = Math.max(getMaxLength(i),max);
        }
        System.out.println(max);
    }

    private static int getMaxLength(int index) {
        int increasingIdx = index;
        int num = arr[index];
        for (int j = index; j < N-1; j++) {
            if(arr[j] < arr[j+1]){
                increasingIdx = j+1;
            }else{
                break;
            }
        }
        return arr[increasingIdx] - arr[index];
    }
}
