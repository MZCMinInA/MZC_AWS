// 10871. X보다 작은 수
package com.example.mzc_aws.BOJ.Bronze05.Bronze05_Day07;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10871 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st1.nextToken());
        int X = Integer.parseInt(st1.nextToken());

        StringBuilder sb = new StringBuilder();

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < N; i++){
            
            int target_num = Integer.parseInt(st2.nextToken());
            if (X > target_num) {
                sb.append(target_num).append(" ");
            }
        }

        System.out.println(sb);
    }
    
}
