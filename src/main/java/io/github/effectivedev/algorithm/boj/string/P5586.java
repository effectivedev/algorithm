package io.github.effectivedev.algorithm.boj.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * JOI와 IOI
 * https://www.acmicpc.net/problem/5586
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-22 13:31
 */

public class P5586 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        char[] joi = new char[]{'J','O','I'};
        char[] ioi = new char[]{'I','O','I'};
        int length = arr.length;
        int cnt = 0;
        int cnt2 = 0;
        for (int i = 0; i < length-2; i++) {
            switch(arr[i]){
                case 'J':
                    if(arr[i+1] == joi[1] && arr[i+2] == joi[2]){
                        cnt++;
                        i++;
                    }
                    break;
                case 'I':
                    if(arr[i+1] == ioi[1] && arr[i+2] == ioi[2]){
                        cnt2++;
                        i++;
                    }
                    break;
            }
        }
        System.out.println(cnt);
        System.out.println(cnt2);
    }
}
