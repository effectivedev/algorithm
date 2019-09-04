package io.github.effectivedev.algorithm.boj.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 연산자 끼워넣기
 * https://www.acmicpc.net/problem/14888
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 04/09/2019 1:04 오후
 */

public class P14888 {
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            int count = Integer.parseInt(st.nextToken());
            for (int j = 0; j < count; j++) {
                list.add(i + 1);
            }
        }
        int[] arr = list.stream().mapToInt(i -> i).toArray();
        do {
            calc(arr, num);
        }
        while ((arr = next_permutation(arr)) != null);
        System.out.println(max);
        System.out.println(min);
    }

    private static void calc(int[] arr, int[] num) {
        int sum = num[0];
        for (int i = 1; i < num.length; i++) {
            int curVal = num[i];
            switch (arr[i - 1]) {
                case 1:
                    sum += curVal;
                    break;
                case 2:
                    sum -= curVal;
                    break;
                case 3:
                    sum *= curVal;
                    break;
                case 4:
                    if (sum < 0) {
                        sum = (sum * -1) / curVal;
                        sum = sum * -1;
                    } else {
                        sum /= curVal;
                    }
                    break;
            }
        }
        max = Math.max(max, sum);
        min = Math.min(min, sum);
    }

    private static int[] next_permutation(int arr[]) {
        int[] copyArr = new int[arr.length];
        System.arraycopy(arr, 0, copyArr, 0, arr.length);
        int lIndex = -1;
        for (int i = 0; i < copyArr.length - 1; i++) {
            if (copyArr[i] < copyArr[i + 1]) {
                lIndex = i;
            }
        }
        if (lIndex == -1) {
            return null;
        } else {
            int max = copyArr[lIndex];
            int rIndex = copyArr.length - 1;
            for (int i = rIndex; i > lIndex; i--) {
                if (max < copyArr[i]) {
                    rIndex = i;
                    break;
                }
            }
            swap(copyArr, lIndex, rIndex);
            reverse(copyArr, lIndex + 1, arr.length - 1);
            return copyArr;
        }
    }

    private static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}