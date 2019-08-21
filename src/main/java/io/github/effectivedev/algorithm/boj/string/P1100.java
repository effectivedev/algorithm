package io.github.effectivedev.algorithm.boj.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 하얀칸
 * https://www.acmicpc.net/problem/1100
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-21 12:43
 */

public class P1100 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        for (int i = 0; i <8 ; i++) {
            String data = br.readLine();
            for (int j = 0; j <8 ; j++) {
                if("F".equals(String.valueOf(data.charAt(j)))){
                    if(i % 2 ==0 && j % 2 == 0 ){
                        cnt++;
                    }
                    else if(i % 2 == 1 && j % 2 == 1){
                        cnt++;
                    }
                }

            }
        }
        br.close();
        System.out.println(cnt);
    }
}
