// 1330. 두 수 비교하기
package com.example.mzc_aws.BOJ.Bronze05.Bronze05_Day03;

import java.util.Scanner;

public class BOJ1330 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();

        if (A > B){
            System.out.println(">");
        } else if (A < B) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    
    }
}
