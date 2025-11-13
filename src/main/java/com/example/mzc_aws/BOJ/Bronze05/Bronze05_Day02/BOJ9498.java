// 9498. 시험 성적
package com.example.mzc_aws.BOJ.Bronze05.Bronze05_Day02;

import java.util.Scanner;

public class BOJ9498 {
    public static void main(String[] args){
    
        Scanner scan = new Scanner(System.in);

        int score = scan.nextInt();

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60 ) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
