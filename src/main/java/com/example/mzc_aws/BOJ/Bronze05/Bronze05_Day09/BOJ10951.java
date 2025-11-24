// 10951. A+B - 4
package com.example.mzc_aws.BOJ.Bronze05.Bronze05_Day09;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ10951 {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;

        while((line = br.readLine()) != null) {
            String[] arr = line.split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);

            System.out.println(a+b);
        }
    }    
}
