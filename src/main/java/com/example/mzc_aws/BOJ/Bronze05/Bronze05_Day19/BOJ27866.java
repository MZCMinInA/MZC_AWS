// 27866. 문자와 문자열
package com.example.mzc_aws.BOJ.Bronze05.Bronze05_Day19;

import java.util.Scanner;

public class BOJ27866 {
    public static void main(String[] args){
        // 문자열 입력 받기
        Scanner scan = new Scanner(System.in);
        // 문자열을 변수에 넣기
        String s = scan.nextLine();
        // 문자열 중 몇번째 글자를 뽑을지 입력받음
        int n = scan.nextInt();

        // 배열은 0부터 시작하기에 -1 처리
        System.out.println(s.charAt(n-1));
    }
}
