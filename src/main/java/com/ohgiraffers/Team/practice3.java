package com.ohgiraffers.Team;

import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {

        /* 스캐너와 if문을 사용하여 1 ~ 12살은 어린이입니다, 13~19살은 청소년입니다. 20~59살은 성인입니다, 60이상은 노인입니다, 나머지는 잘못된 나이입니다
        * 가 출력되게 하시오*/

        // Scanner 객체를 생성하여 사용자 입력을 받기 위한 준비
        Scanner scanner = new Scanner(System.in);

        // 사용자에게 나이를 입력 받기
        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();

        // 나이에 따라 적절한 메시지 출력
        if (age > 0 && age <= 12) {
            System.out.println("어린이입니다.");
        } else if (age >= 13 && age <= 19) {
            System.out.println("청소년입니다.");
        } else if (age >= 20 && age <= 59) {
            System.out.println("성인입니다.");
        } else if (age >= 60) {
            System.out.println("노인입니다.");
        } else {
            System.out.println("잘못된 나이입니다.");
        }

        // Scanner 객체를 닫아줍니다.
        scanner.close();
    }
}
