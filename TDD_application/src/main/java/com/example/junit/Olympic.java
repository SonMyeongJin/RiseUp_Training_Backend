package com.example.junit;

public class Olympic {
    /*
        올림익이 개최된 연도인지 판별하는 테스트
        @param year 기원년도
        @return 하계 얼림픽이 개최된적이 있으면 true, 아니면 false
        @throws IllegalArgumentException 아직 개최가 확정되지 않은 해가 요구되어질때 예외 반환
    */

    public boolean isSummerOlympicYear(int year) throws IllegalArgumentException {
        if (year < 1896) {
            return false;
        }
        if (year == 1916 || year == 1940 || year == 1944 || year == 2020) {
            return false;
        }
        if (year == 2021 ) {
            return true;
        }
        if (2032 < year) {
            throw new IllegalArgumentException(
                    "2032년까지 올림픽이 확정되었습니다. 입력하신 연도는:" + year + "입니다.");
        }
        return year % 4 == 0;
    }
}
