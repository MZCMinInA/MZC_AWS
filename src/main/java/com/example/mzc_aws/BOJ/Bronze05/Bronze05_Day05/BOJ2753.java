// 2753. 윤년
package com.example.mzc_aws.BOJ.Bronze05.Bronze05_Day05;

import java.util.Scanner;

public class BOJ2753 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int year = scan.nextInt();

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
    
}
