package io.github.effectivedev.algorithm.boj.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Adding Reversed Numbers
 * https://www.acmicpc.net/problem/3486
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 18/09/2019 11:08 오전
 */

public class P3486 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            sb.append(reverseDeleteZero(String.valueOf(reversedSum(st.nextToken(), st.nextToken()))));
            sb.append("\n");
        }
        System.out.print(sb);
    }
    private static int reversedSum(String a, String b){
        return reverseToInt(a)+reverseToInt(b);
    }
    private static String reverse(String str){
        char[] data = str.toCharArray();
        int i= 0;
        int j = str.length() -1;
        while(i <= j){
            char temp;
            temp = data[i];
            data[i] = data[j];
            data[j] = temp;
            i++;
            j--;
        }
        return String.valueOf(data);
    }
    private static String reverseDeleteZero(String str){
        String reverse = reverse(str);
        int i= 0;
        int cnt = 0;
        while(true){
            if(reverse.charAt(i) == '0'){
                cnt++;
            }else{
                break;
            }
            i++;
        }
        return reverse.substring(cnt);
    }
    private static int reverseToInt(String str){
        return Integer.parseInt(reverse(str));
    }
}
