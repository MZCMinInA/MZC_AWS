// 2438. 별 찍기 - 1
package com.example.mzc_aws.BOJ.Bronze05.Bronze05_Day03;

import java.util.Scanner;

public class BOJ2438 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        for(int i = 1; i <= num; i++){
            System.out.println("*".repeat(i));
            
        }

    }
    
}
