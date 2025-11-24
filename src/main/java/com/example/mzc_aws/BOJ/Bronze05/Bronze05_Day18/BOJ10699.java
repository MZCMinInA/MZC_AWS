// 106993. 오늘 날짜
package com.example.mzc_aws.BOJ.Bronze05.Bronze05_Day18;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class BOJ10699 {
    public static void main(String[] args) {
        // 서울 시간 가져오기
        ZonedDateTime seoulTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));

        // yyyy-MM-dd 포맷으로 출력
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.print(seoulTime.format(formatter));
    }
    
}
