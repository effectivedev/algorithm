package io.github.effectivedev.algorithm.boj.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * 이진수
 * https://www.acmicpc.net/problem/2226
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-23 08:46
 */

public class P2226 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        BigInteger[] arr = new BigInteger[n+1];

        arr[1] =new BigInteger("0");
        BigInteger b1 = new BigInteger("1");
        BigInteger bMinus1 = new BigInteger("-1");
        BigInteger b2 = new BigInteger("2");
        for (int i = 2; i <=n ; i++) {
            if(i%2 ==0){
                arr[i] = arr[i-1].multiply(b2).subtract(bMinus1);
            }else{
                arr[i] = arr[i-1].multiply(b2).subtract(b1);
            }
        }
        System.out.println(arr[n]);
    }
}