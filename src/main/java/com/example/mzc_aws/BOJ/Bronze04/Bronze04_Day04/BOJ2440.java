// 2440. 별 찍기 - 3
package com.example.mzc_aws.BOJ.Bronze04.Bronze04_Day04;

import java.util.Scanner;

public class BOJ2440 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        for(int i = num; i >= 1; i--){
            System.out.println("*".repeat(i));
        }
    }
    
}
