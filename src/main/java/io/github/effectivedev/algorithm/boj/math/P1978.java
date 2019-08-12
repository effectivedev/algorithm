package io.github.effectivedev.algorithm.boj.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 소수 찾기
 * https://www.acmicpc.net/problem/1978
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-12 11:03
 */

public class P1978 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr= Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int cnt=0;
        for (int i = 0, length= arr.length; i < length; i++) {
            int num = arr[i];
            if(num == 1){
                continue;
            }
            boolean isPrime = true;
            for (int j = 2, len =(int)Math.sqrt(num); j <= len; j++) {
                if(arr[i] % j ==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
