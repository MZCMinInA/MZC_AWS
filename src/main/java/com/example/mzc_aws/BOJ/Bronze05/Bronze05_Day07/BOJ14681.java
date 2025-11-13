// 14681. 사분면 고르기
package com.example.mzc_aws.BOJ.Bronze05.Bronze05_Day07;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ14681 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());
        int Y = Integer.parseInt(br.readLine());

        if (X > 0 && Y >0){
            System.out.println(1);
        } else if (X < 0 && Y > 0) {
            System.out.println(2);
        } else if (X < 0 && Y < 0) {
            System.out.println(3);
        } else if (X > 0 && Y < 0) {
            System.out.println(4);
        }

    }
    
}
