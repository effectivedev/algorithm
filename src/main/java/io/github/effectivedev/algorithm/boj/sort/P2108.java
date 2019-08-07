package io.github.effectivedev.algorithm.boj.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 통계학
 * https://www.acmicpc.net/problem/2108
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019-08-07 16:04
 */
public class P2108 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        int[] intArray = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            intArray[i] = Integer.parseInt(br.readLine());
        }
        int sum = 0;
        for (int i = 0; i < cnt; i++) {
            sum += intArray[i];
        }
        //산술평균
        System.out.println(Math.round((double) sum / cnt));

        //중간값 : 정렬 후 가운데 값
        Arrays.sort(intArray);
        System.out.println(intArray[cnt / 2]);

        //키, 출현횟수 맵에 저장
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < cnt; i++) {
            int num = intArray[i];
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }
        int max=0;
        Iterator it = map.keySet().iterator();
        //최빈값 출현 횟수 찾기
        while( it.hasNext()){
           int value = map.get(it.next());
           if(value > max){
               max =value;
           }
        }
        //최빈값 키 리스트 구하기
        List<Integer> modeList =new ArrayList<>();
        it = map.keySet().iterator();
        while(it.hasNext()){
            int key = (int) it.next();
            if( map.get(key)== max){
                modeList.add(key);
            }
        }

        if(modeList.size() == 1){
            System.out.println(modeList.get(0));
        }else{
            //최빈값이 여러개일 경우 내림차순 정렬
            modeList.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2 - o1;
                }
            });
            System.out.println(modeList);
            System.out.println(modeList.get(modeList.size()-2));
        }
        //범위
        System.out.println(Math.abs(intArray[0] - intArray[cnt - 1]));
    }
}
