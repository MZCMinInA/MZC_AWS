// 10039. 평균 점수
package com.example.mzc_aws.BOJ.Bronze04.Bronze04_Day05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ10039 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int totalScore = 0;

        for(int i = 0; i < 5; i++){
            int score = Integer.parseInt(br.readLine());
            totalScore += score >= 40 ? score : 40;
        }

        System.out.print(totalScore / 5);
    }
    
}
