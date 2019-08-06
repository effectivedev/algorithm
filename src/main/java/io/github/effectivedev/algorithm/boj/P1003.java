package io.github.effectivedev.algorithm.boj;

import java.util.*;

public class P1003 {
    static Map<String, Map<String,Integer>> map = new HashMap<>();
    static Map<Integer, Integer> fiboMap = new HashMap<>();
    static int CNT0=0;
    static int CNT1=0;

    public static void main(String[] args) {

        long time = System.currentTimeMillis();
        System.out.println(System.currentTimeMillis() - time);
    }

    private static int fibonacci(int n) {

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else{
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    private static Map count(int n) {
        String number = String.valueOf(n);
        if(map.containsKey(number)){
            return map.get(number);
        }
        else{
            int cnt0=0;
            int cnt1=0;
            for (int i = 0; i < number.length(); i++) {
                String value = String.valueOf(number.charAt(i));
                if ("0".equals(value)) {
                    cnt0 += 1;
                } else if ("1".equals(value)){
                    cnt1 += 1;
                }
                Map<String, Integer> nMap = new HashMap();
                nMap.put("0",cnt0);
                nMap.put("1",cnt1);
                map.put(number, nMap);
            }
            return map.get(number);
        }
    }
}
