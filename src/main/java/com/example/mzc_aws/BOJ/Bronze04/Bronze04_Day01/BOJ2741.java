// 2741. N 찍기
package com.example.mzc_aws.BOJ.Bronze04.Bronze04_Day01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2741 {
    public static void main(String[] args) throws Exception{
        // 입력을 받기 위함.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력받은 값을 num에 넣음
        int num = Integer.parseInt(br.readLine());

        for(int i = 1; i <= num ; i++){
            System.out.println(i);
        }
    }
}
