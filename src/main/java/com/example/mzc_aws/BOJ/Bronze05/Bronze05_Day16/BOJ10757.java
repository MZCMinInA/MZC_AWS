// 10757. 큰 수 A+B
package com.example.mzc_aws.BOJ.Bronze05.Bronze05_Day16;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BOJ10757 {
    public static void main(String[] args) throws Exception {
        // 입력 받음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 한줄에 띄어쓰기 기준으로 자름
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 입력 받은 숫자가 크기에 BitInteger로 받음
        BigInteger A = new BigInteger(st.nextToken());
        BigInteger B = new BigInteger(st.nextToken());
        // 숫자 2개 더하기
        System.out.print(A.add(B));
    }
    
}
