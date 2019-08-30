package io.github.effectivedev.algorithm.boj.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

/**
 * 신입사원
 * https://www.acmicpc.net/problem/1946
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-30 14:22
 */

public class P1946 {
    static int b = 0;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < n; i++) {
//
//
//        }
//        br.close();
        int cnt = Integer.parseInt(br.readLine());
        Person[] pArr = new Person[cnt];
        for (int j = 0; j < cnt; j++) {
            st = new StringTokenizer(br.readLine());
            pArr[j] = new Person();
            pArr[j].doc = Integer.parseInt(st.nextToken());
            pArr[j].interview = Integer.parseInt(st.nextToken());
        }
        br.close();

        Arrays.sort(pArr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if((o1.doc > o2.doc) && (o1.interview > o2.interview)){
                    b++;
                    return 1;
                }
                else if(((o1.doc > o2.doc) && (o1.interview)<o2.interview) ||  ((o1.doc < o2.doc) && (o1.interview)>o2.interview)){
                    return 0;
                }
                else{
                    return -1;
                }
            }
        });
        System.out.println(b);
        System.out.println(Arrays.toString(pArr));

    }

    static class Person {
        int doc;
        int interview;

        @Override
        public String toString() {
            return "Person{" +
                    "doc=" + doc +
                    ", interview=" + interview +
                    '}';
        }
    }
}
