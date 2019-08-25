package io.github.effectivedev.algorithm.boj.math;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//lotto
public class P6603 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String nextLine = sc.nextLine();
            if ("0".equals(nextLine)) {
                break;
            }
            List<Integer> list = Arrays.stream(nextLine.split("\\s")).map(i -> Integer.valueOf(i))
                    .collect(Collectors.toList());
            int k = list.get(0);
            List<Integer> sublist = list.subList(1, list.size());
            System.out.println(k);
            System.out.println(sublist);
        }
    }

}
