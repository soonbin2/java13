package com.ohgiraffers.level01.basic;

public class Application {
    public static void main(String[] args) {
        //1.메소드 호출 확인용 메소드 호출
        Calculator calc = new Calculator();
        calc.checkMethod();

        // 2. 함수를 호출하여 1~10까지의 합을 리턴 받아 출력
        int i=1;
        int sum =0;
        int result = calc.sum1to10(i,sum);
        System.out.println("1~10까지의 합 : " + result);

        // 3. 10,20 두 개의 정수를 매개변수로 하여 큰 값 출력하는 메소드 호출
        int a=20;
        int b=10;
        int result2 = calc.checkMaxNumber(a,b);
        System.out.println("큰 값 출력 : " + result2);

        //4. 10,20 두 개의 정수를 매개변수로 하여 두 수를 더하는 메소드 호출 후 리턴값 출력
        int c= 10;
        int d= 20;
        int result3 = calc.sumTwoNumber(c,d);
        System.out.println("두 수 더한 값 : " + result3);

        //5. 10,5 두 개의 정수를 매개변수로 하여 두 수의 차를 구하는 메소드 호출 후 리턴값 출력
        int e=10;
        int f=5;
        int result4 = calc.minusTwoNumber(e,f);
        System.out.println("두 수 뺀 값 : " + result4);

    }
}
