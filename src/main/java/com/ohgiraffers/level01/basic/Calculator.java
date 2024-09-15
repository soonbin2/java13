package com.ohgiraffers.level01.basic;

public class Calculator {

    public static void checkMethod(){
        System.out.println("메소드 호출 확인");
    }

    public static int sum1to10(int i, int sum ){
        while (i<=10){
            sum = sum + i;
            i++;
        }
        return sum;
    }
    public static int checkMaxNumber(int a, int b){
        return (a> b)? a:b;
    }
    public static int sumTwoNumber(int c, int d){
        return c+d;
    }
    public static int minusTwoNumber(int e, int f){
        return e-f;
    }
}
