package io.github.effectivedev.algorithm.boj.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 금민수의 개수
 * https://www.acmicpc.net/problem/1527
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 06/09/2019 1:05 오후
 *
 * 은민이는 4와 7을 좋아하고, 나머지 숫자는 싫어한다. 금민수는 어떤 수가 4와 7로만 이루어진 수를 말한다.
 * A와 B가 주어졌을 때, A보다 크거나 같고, B보다 작거나 같은 자연수 중에 금민수인 것의 개수를 출력하는 프로그램을 작성하시오.
 */

public class P1527 {
    static int cnt = 0;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        go(0, 0,  a, b);
        System.out.println(cnt);
    }
    private static void go(long current, int index,  long a,  long b){
        if(current > b){
            return;
        }else{
            if(current != 0){
                if(current >= a && current <= b){
                    cnt++;
                }
            }
            go(current+4*(long)Math.pow(10, index), index+1,  a, b);
            go(current+7*(long)Math.pow(10, index), index+1,  a, b);
        }
    }
}
