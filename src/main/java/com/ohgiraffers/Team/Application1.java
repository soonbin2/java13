package com.ohgiraffers.Team;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        //스캐너를 사용하여 첫번째 숫자를 입력하고 두번째 숫자도 입력하여 두 숫자를 더한 값이 나오게 출력하세요.
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력해주세요 : ");
        int num = sc.nextInt();
        System.out.print("두번째 숫자를 입력해주세요 : ");
        int num2 = sc.nextInt();
        int result = num + num2;
        System.out.println("두 수를 더한 값 : " + result);

    }
}
