// 5543. 상근날드
package com.example.mzc_aws.BOJ.Bronze04.Bronze04_Day06;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ5543 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int buggerAPrice = Integer.parseInt(br.readLine());
        int buggerBPrice = Integer.parseInt(br.readLine());
        int buggerCPrice = Integer.parseInt(br.readLine());
        int drinkAPrice = Integer.parseInt(br.readLine());
        int drinkBPrice = Integer.parseInt(br.readLine());

        System.out.print(Math.min(Math.min(buggerAPrice, buggerBPrice),buggerCPrice) + Math.min(drinkAPrice, drinkBPrice) - 50);
    }

}
