// 8393. 합
package com.example.mzc_aws.BOJ.Bronze05.Bronze05_Day05;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class BOJ8393 {
    public static void main(String[] args) throws Exception{

        int hap = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        

        int num = Integer.parseInt(br.readLine());


        for(int i = 1; i <= num; i++){
            hap += i;
        }

        System.out.print(hap);
    }
}
