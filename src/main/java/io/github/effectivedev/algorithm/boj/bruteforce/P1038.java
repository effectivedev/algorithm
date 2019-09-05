package io.github.effectivedev.algorithm.boj.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 감소하는 수
 * https://www.acmicpc.net/problem/1038
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 05/09/2019 10:09 오전
 */

public class P1038 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data = br.readLine();
        int n = Integer.parseInt(data);
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        List<Long> decreaseList = new ArrayList<>();
        go("", arr, decreaseList);
        Collections.sort(decreaseList, Long::compareTo);
        if(n > decreaseList.size()){
            System.out.println(-1);
        }else if(n == 0){
            System.out.println(0);
        }
        else{
            System.out.println(decreaseList.get(n-1));
        }
    }

    private static void go(String num, int[] arr, List<Long> decreaseList) {
        if(num.length() == 11){
            return;
        }
        if(!num.isEmpty() && !num.equals("0")){
            decreaseList.add(Long.parseLong(num));
        }
        for (int i = 0; i < 10; i++) {
            if(num.length() == 0){
                go(num+arr[i], arr, decreaseList);
            }else{
                int last = num.charAt(0)-'0';
                if(last < arr[i]){
                    go(arr[i]+num, arr, decreaseList);
                }
            }
        }
    }
}
