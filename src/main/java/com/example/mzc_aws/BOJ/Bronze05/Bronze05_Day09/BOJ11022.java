// 11022. A+B - 8
package com.example.mzc_aws.BOJ.Bronze05.Bronze05_Day09;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11022 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= N; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            sb.append("Case #").append(i).append(": ").append(A).append(" + ").append(B).append(" = ").append(A+B).append("\n");
        }
        System.out.print(sb);
    }
    
}
