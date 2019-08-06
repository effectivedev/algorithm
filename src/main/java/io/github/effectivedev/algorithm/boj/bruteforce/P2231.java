package io.github.effectivedev.algorithm.boj.bruteforce;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

/**
 * BOJ 2231 분해합
 * https://www.acmicpc.net/problem/2231
 *
 * @author effectivedev
 */
public class P2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strNum = br.readLine();
        int n = Integer.parseInt(strNum);
        boolean hasSolution = false;
        for(int i=1; i<=n; i++){
            int sum = 0;
            String strCurrentNum = String.valueOf(i);
            for (int j = 0; j < strCurrentNum.length(); j++) {
                sum+= Integer.parseInt(String.valueOf(strCurrentNum.charAt(j)));
            }
            sum += i;
            if(sum == n){
                hasSolution = true;
                System.out.println(i);
                break;
            }
        }
        if(!hasSolution){
            System.out.println("0");
        }

    }
}
