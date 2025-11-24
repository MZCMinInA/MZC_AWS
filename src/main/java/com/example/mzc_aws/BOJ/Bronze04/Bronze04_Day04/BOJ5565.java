// 5565. 영수증
package com.example.mzc_aws.BOJ.Bronze04.Bronze04_Day04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ5565 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int totalPrice = Integer.parseInt(br.readLine());

        for(int i = 0; i < 9; i++){
            totalPrice -= Integer.parseInt(br.readLine());
        }
        System.out.println(totalPrice);
    }
    
}
