package io.github.effectivedev.algorithm.boj.whilestatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * A + B - 4
 * https://www.acmicpc.net/problem/10951
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-09 12:46
 */

public class P10951
{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line =null;
        while((line=br.readLine()) !=null){
            if(line.length() != 3){
                break;
            }
            String[] arr = line.split(" ");
            sb.append(Integer.parseInt(arr[0])+Integer.parseInt(arr[1])).append("\n");
        }
        System.out.println(sb);
    }
}
