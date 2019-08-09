package io.github.effectivedev.algorithm.boj.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 최댓값
 * https://www.acmicpc.net/problem/2562
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-09 14:40
 */

public class P2562 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numArr[] = new int[9];

        for (int i = 0; i <9 ; i++) {
            numArr[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        int max=numArr[0];
        int position = 0;
        for (int i = 1; i <9 ; i++) {
            if(max < numArr[i]){
                max = numArr[i];
                position=i;
            }
        }
        System.out.println(max);
        System.out.println(position+1);
    }
}
