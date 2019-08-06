package io.github.effectivedev.algorithm.boj.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class P7629 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.valueOf(br.readLine());
        Integer[] weights = new Integer[cnt];
        Integer[] heights = new Integer[cnt];

        for (int i = 0; i < cnt; i++) {
            String person = br.readLine();
            String weight = person.split("\\s")[0];
            String height = person.split("\\s")[1];
            weights[i] = Integer.parseInt(weight);
            heights[i] = Integer.parseInt(height);
        }
        Integer[] weightRank = getRank(weights, "reverse");
        Integer[] heightRank = getRank(heights, "reverse");
        Integer[] total = new Integer[cnt];

        printResult(weightRank);
        printResult(heightRank);
    }

    public static void printResult(Integer[] arr) {
        int cnt = arr.length;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cnt ; i++) {
            sb.append(arr[i]+" ");
        }
        System.out.println(sb.toString().trim());
    }

    public static Integer[] getRank(Integer[] integerArr, String order) {
        Integer[] sortedArr = Arrays.copyOf(integerArr, integerArr.length);
        if ("forward".equals(order)) {
            Arrays.sort(sortedArr);
        } else {
            Arrays.sort(sortedArr, Collections.reverseOrder());
        }

        int cnt = integerArr.length;
        Integer[] rankArr = new Integer[cnt];
        for (int i = 0; i < cnt; i++) {
            int num = integerArr[i];
            for (int j = 0; j < cnt; j++) {
                if (num == sortedArr[j]) {
                    rankArr[i] = j + 1;
                    break;
                }
            }
        }
        return rankArr;
    }
}
