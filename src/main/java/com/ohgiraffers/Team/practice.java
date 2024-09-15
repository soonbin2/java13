package com.ohgiraffers.Team;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        /* 스캐너를 활용하여 두개의 숫자를 입력한 뒤 합과 평균을 계산하고 출력하시오.*/



        // Scanner 객체를 생성하여 사용자 입력을 받기 위한 준비
        Scanner scanner = new Scanner(System.in);

        // 사용자에게 두 개의 숫자를 입력하도록 요청
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = scanner.nextInt();

        // 두 숫자의 합과 평균을 계산
        int sum = num1 + num2;
        double average = sum / 2.0;

        // 결과를 출력
        System.out.println("두 숫자의 합: " + sum);
        System.out.println("두 숫자의 평균: " + average);

        // Scanner 객체를 닫아줍니다.
        scanner.close();
    }
}
