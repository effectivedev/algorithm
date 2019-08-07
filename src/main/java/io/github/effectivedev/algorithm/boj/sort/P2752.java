package io.github.effectivedev.algorithm.boj.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 수 정렬하기 3 - 카운팅 정렬
 * https://www.acmicpc.net/problem/2752
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-07 15:19
 */
public class P2752 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int[] numArr = new int[cnt];
        int[] numCntArr = new int[10001];
        for (int i = 0; i < cnt; i++) {
            numArr[i] = Integer.valueOf(br.readLine());
        }
        br.close();
        for (int i = 0; i < cnt; i++) {
            int num = Integer.valueOf(numArr[i]);
            numCntArr[num] = numCntArr[num]+1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1, length = numCntArr.length; i < length; i++) {
            int numCnt = numCntArr[i];
            if(numCnt > 0){
                for (int j = 0; j < numCnt ; j++) {
                    sb.append(i+ " ");
                }

            }
        }
        System.out.println(sb.toString());
    }
}
