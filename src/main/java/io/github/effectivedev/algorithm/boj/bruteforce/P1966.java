package io.github.effectivedev.algorithm.boj.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * 프린터 큐
 * https://www.acmicpc.net/problem/1966
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-09-04 10:20
 */

public class P1966 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            LinkedList<Doc> ll = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                ll.offer(new Doc(Integer.valueOf(st.nextToken()), j==M? true: false));
            }
            int cnt = 0;
            int size =ll.size();
            while(ll.size() != 0){
                int peek = ll.peek().priority;
                boolean hasMoreHighPriority = false;
                for (int j = 1; j < ll.size() ; j++) {
                    if(peek < ll.get(j).priority){
                        hasMoreHighPriority = true;
                        break;
                    }
                }
                //마지막으로 보내기
                if(hasMoreHighPriority){
                    ll.addLast(ll.poll());
                }//첫수 뽑기
                else{
                    cnt++;
                    if(ll.peek().wantToFind == true){
                        sb.append(cnt).append("\n");
                        break;
                    }
                    ll.poll();
                }
            }
        }
        System.out.print(sb);
    }
    static class Doc{
        int priority;
        boolean wantToFind;

        public Doc(int priority, boolean wantToFind) {
            this.priority = priority;
            this.wantToFind = wantToFind;
        }
    }
}
