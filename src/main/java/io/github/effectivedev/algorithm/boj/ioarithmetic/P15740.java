package io.github.effectivedev.algorithm.boj.ioarithmetic;

import java.io.*;
import java.math.BigDecimal;

/**
 * A+B-9
 * https://www.acmicpc.net/problem/15740
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-13 17:03
 */

public class P15740 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] data = br.readLine().split(" ");

        BigDecimal bdA = new BigDecimal(data[0]);
        BigDecimal bdB = new BigDecimal(data[1]);
        bw.write(bdA.add(bdB).toPlainString()+"\n");
        bw.close();
    }
}
