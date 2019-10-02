package io.github.effectivedev.algorithm.boj.dnc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 히스토그램에서 가장 큰 직사각형
 * https://www.acmicpc.net/problem/6549
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 02/10/2019 11:31 오전
 */

public class P6549 {
    static long[] h = new long[100001];
    static long ans;
    static StringBuilder sb = new StringBuilder();
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data = null;
        StringTokenizer st;

        int n;
        while ((data = br.readLine()) != null && !"0".equals(data)) {
            st = new StringTokenizer(data);
            n = Integer.parseInt(st.nextToken());
            for (int i = 0; i < n; i++) {
                h[i] = Integer.parseInt(st.nextToken());
            }
            sb.append(solve(0, n-1));
            sb.append("\n");
        }
        System.out.print(sb);
    }

    private static long solve(int left, int right) {
        if (left == right) {
            return h[left];
        }
        int mid = (left + right) / 2;
        // Max : left Side , right Side
        ans = Math.max(solve(left, mid), solve(mid + 1, right));
        int lo = mid;
        int hi = mid + 1;
        long height = Math.min(h[lo], h[hi]);
        ans = Math.max(ans, height * 2);
        //왼쪽과 오른쪽을 비교하여 값이 큰 쪽을 증가시킴
        while (lo > left || hi < right) {
            if (hi < right && (lo == left || h[lo - 1] < h[hi + 1])) {
                ++hi;
                height = Math.min(height, h[hi]);
            } else {
                --lo;
                height = Math.min(height, h[lo]);
            }
            ans = Math.max(ans, height * (hi - lo + 1));
        }
        return ans;
    }

}