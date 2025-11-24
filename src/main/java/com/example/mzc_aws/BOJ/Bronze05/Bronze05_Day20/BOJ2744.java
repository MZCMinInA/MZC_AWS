// 2744. 대소문자 바꾸기
package com.example.mzc_aws.BOJ.Bronze05.Bronze05_Day20;

import java.util.Scanner;

public class BOJ2744 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        for(int i = 0; i < s.length(); i++){
            
            System.out.println(s.charAt(i) - 27);
        }
    }
    
}
