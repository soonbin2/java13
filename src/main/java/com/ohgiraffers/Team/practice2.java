package com.ohgiraffers.Team;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        /*스캐너와 for문을 활용하여 입력한 숫자까지의 짝수를 출력하고 홀수도 출력하시오*/



        // Scanner 객체를 생성하여 사용자 입력을 받기 위한 준비
        Scanner scanner = new Scanner(System.in);

        // 사용자에게 숫자를 입력 받기
        System.out.print("정수를 입력하세요: ");
        int number = scanner.nextInt();

        // 짝수와 홀수를 구분하여 출력
        System.out.println("입력한 숫자까지의 짝수:");
        for (int i = 0; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println(); // 줄 바꿈

        System.out.println("입력한 숫자까지의 홀수:");
        for (int i = 0; i <= number; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        // Scanner 객체를 닫아줍니다.
        scanner.close();
    }
}

