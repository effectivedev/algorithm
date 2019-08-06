package io.github.effectivedev.algorithm.boj.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

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
        Integer[] sortedWeights = Arrays.copyOf(weights, weights.length);
        Arrays.sort(sortedWeights, Collections.reverseOrder());
        Integer[] sortedHeights = Arrays.copyOf(heights, heights.length);
        Arrays.sort(sortedHeights, Collections.reverseOrder());

        Map<Integer, Map<Integer, Integer>> map = new HashMap<>();
        for (int i = 0; i < cnt; i++) {
            int wRank = 0;
            int hRank = 0;
            Integer w = weights[i];
            for (int j = 0; j < cnt; j++) {
                if(w == sortedWeights[j]){
                    wRank = j+1;
                }
            }
            Integer h = heights[i];
            for (int j = 0; j < cnt; j++) {
                if(h == sortedHeights[j]){
                    hRank = j+1;
                }
            }
            Integer[] rankSum = new Integer[cnt];
            for (int j = 0; j < cnt; j++) {
                rankSum[j] = wRank+hRank;
            }

            Arrays.stream(rankSum).forEach(System.out::println);
        }
    }
}
