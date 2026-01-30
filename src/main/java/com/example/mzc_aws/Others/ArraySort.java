package com.example.mzc_aws.Others;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class ArraySort {
    /*
    배열 정렬하기
    권장 시간 : 10분
    권장 시간복잡도 : O(NlogN)
    제약 조건
    • 정수 배열의 길이는 2이상 10^5 이하이다
    • 정수 배열의 각 데이터 값은 -100,000 이상 100.000 이하입니다
    입출력의 예
    입력
    [1, -5, 2, 4, 3]

    출력
    [-5, 1, 2, 3, 4]

    입력
    [2, 1, 1, 3, 2, 5, 4]

    출력
    [1, 1, 2, 2, 3, 4, 5]

    입력
    [6, 1, 7]
    출력
    [1, 6, 7]
     */
    public static void main(String[] args) throws Exception{
        List<Integer> numbers = new ArrayList<>();

        // 한줄 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 한줄 입력 받은거 "," 기준으로 끊기
        StringTokenizer st = new StringTokenizer(br.readLine(), ",");

        // 데이터 담기 위함
        StringBuilder sb = new StringBuilder();

        // 입력된 내용이 끝날 때 까지 처리
        while(st.hasMoreTokens()){
            // 입력받은 한줄의 ","기준으로 공백 제거하여 받음
            String token = st.nextToken().trim();
            // 위의 받은 글자 중 "[", "]"를 제거하여 받음
            int num = Integer.parseInt(token
                    .replace("[", "")
                    .replace("]", ""));
            // ArrayList에 넣음
            numbers.add(num);
        }
        // 정렬하기
        Collections.sort(numbers);

        // 정렬된 숫자 넣기
        sb.append(numbers);

        // 출력하기
        System.out.println(sb);
    }
}
