package io.github.effectivedev.algorithm.boj.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * FBI
 * https://www.acmicpc.net/problem/2857
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-22 17:43
 */

public class P2857 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data = null;
        List<Integer> fbiList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            data = br.readLine();
            int length = data.length();
            for (int j = 0; j < length - 2; j++) {
                if (data.charAt(j) == 'F' && data.charAt(j + 1) == 'B' && data.charAt(j + 2) == 'I') {
                    fbiList.add(i + 1);
                    break;
                }
            }
        }

        int size = fbiList.size();
        if (size == 0) {
            System.out.println("HE GOT AWAY!");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.print(fbiList.get(i) + " ");
            }
        }

    }
}
