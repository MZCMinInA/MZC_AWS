// 10872. 팩토리얼
package com.example.mzc_aws.BOJ.Bronze05.Bronze05_Day11;

import java.util.Scanner;

public class BOJ10872 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int fact = 1;

        for(int i = 1; i <= num; i++){
            fact *= i;
        }
        System.out.print(fact);

    }
    
}
