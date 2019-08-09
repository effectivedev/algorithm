package io.github.effectivedev.algorithm.boj.function;

/**
 * 정수 N개의 합
 * https://www.acmicpc.net/problem/15596
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-09 16:00
 */

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.sum(new int[]{2,3,4,5,6}));
    }

    long sum(int[] a) {
        long ans = 0;
        for (int i = 0, l = a.length; i < l; i++) {
            ans += a[i];
        }
        return ans;
    }
}
