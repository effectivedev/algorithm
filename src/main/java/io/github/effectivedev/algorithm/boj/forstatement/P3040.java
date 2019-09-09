package io.github.effectivedev.algorithm.boj.forstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백설 공주와 일곱 난쟁이
 * https://www.acmicpc.net/problem/3040
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 09/09/2019 2:32 오후
 */

public class P3040 {
    static boolean hasSolution =false;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] result = new int[9];
        for (int i = 0; i < 9; i++) {
            result[i] = Integer.parseInt(br.readLine());
        }
        combination(new int[9], 9, 7, 0, 0, result);
    }
    private static void combination(int[] arr, int n, int r, int index, int target, int[] result){
        if(hasSolution){
            return;
        }
        if(r == 0){
            int sum = 0;
            for (int i = 0; i < 7; i++) {
                sum += result[arr[i]];
            }
            if(sum == 100){
                hasSolution = true;
                for (int i = 0; i < 7; i++) {
                    System.out.println(result[arr[i]]);
                }
            }
            return;
        }else if(n == target){
            return;
        }else{
            arr[index] = target;
            combination(arr, n, r-1, index+1, target+1, result);
            combination(arr, n, r, index, target+1, result);
        }
    }
}
