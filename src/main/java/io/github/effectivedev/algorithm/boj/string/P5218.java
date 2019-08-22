package io.github.effectivedev.algorithm.boj.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 알파벳 거리
 * https://www.acmicpc.net/problem/5218
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-22 14:00
 */

public class P5218 {
    private static final String DISTANCE = "Distances: ";
    private static final String SPACE = " ";
    private static final String NEW_LINE = "\n";
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            char[] aArr = st.nextToken().toCharArray();
            char[] bArr = st.nextToken().toCharArray();
            int length = aArr.length;
            sb.append(DISTANCE);
            for (int i = 0; i < length; i++) {
                int a = (int)aArr[i];
                int b = (int)bArr[i];
                if(a<=b){
                    sb.append(b-a);
                }else{
                    sb.append(b+26-a);
                }
                sb.append(SPACE);
            }
            sb.append(NEW_LINE);
        }
        br.close();
        System.out.println(sb);
    }
}
