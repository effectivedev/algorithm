package io.github.effectivedev.algorithm.boj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * BOJ 2798 블랙잭
 * https://www.acmicpc.net/problem/2798
 *
 * @author effectivedev
 */
public class P2798 {
    static int max = 0;
    static int m =0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        m = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if(num <m){
                list.add(num);
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        calcCombination(arr, arr.length, 3);
        System.out.println(max);
    }
    static void combinationUtil(int arr[], int data[], int start,
                                int end, int index, int r)
    {
        if (index == r)
        {
            int sum = 0;
            for (int j=0; j<r; j++){
                sum += data[j];
            }
            if(sum > max && sum<= m){
                max = sum;
            }
            return;
        }
        for (int i=start; i<=end && end-i+1 >= r-index; i++)
        {
            data[index] = arr[i];
            combinationUtil(arr, data, i+1, end, index+1, r);
        }
    }
    static void calcCombination(int arr[], int n, int r)
    {
        int data[]=new int[r];
        combinationUtil(arr, data, 0, n-1, 0, r);
    }
}
