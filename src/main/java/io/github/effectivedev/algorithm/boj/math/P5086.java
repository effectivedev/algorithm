package io.github.effectivedev.algorithm.boj.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 배수와 약수
 * https://www.acmicpc.net/problem/5086
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 09/09/2019 8:33 오전
 */

public class P5086 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data;
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while ((data = br.readLine()) != null) {
            st = new StringTokenizer(data);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a == 0 && b ==0){
                break;
            }
            if ((a < b) && ((b % a) == 0)) {
                sb.append("factor");
            }else if((a > b) && ((a % b) == 0)){
                sb.append("multiple");
            }else{
                sb.append("neither");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
