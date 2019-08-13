package io.github.effectivedev.algorithm.boj.ioarithmetic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 공백 없는 A+B
 * https://www.acmicpc.net/problem/15873
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-13 17:14
 */

public class P15873 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data = br.readLine();
        if(data.length() ==4){
            System.out.println(20);
        }else if(data.length() ==3){
            boolean isPrint = false;
            int a2 = Integer.parseInt(data.substring(0,2));
            int b1 = Integer.parseInt(data.substring(2,3));
            if(0 <a2 && a2<=10){
                if(0 <b1 && b1<=10){
                    isPrint = true;
                    System.out.println(a2+b1);
                }
            }
            if(!isPrint){
                int a1 = Integer.parseInt(data.substring(0,1));
                if(!"0".equals(data.substring(1,2))){
                    int b2= Integer.parseInt(data.substring(1,3));
                    if(0 <a1 && a1<=10){
                        if(0 <b2 && b2<=10){
                            System.out.println(a1+b2);
                        }
                    }
                }
            }
        }else{
            int a= Integer.parseInt(data.substring(0,1));
            int b =Integer.parseInt(data.substring(1,2));
            System.out.println(a+b);
        }
    }
}
