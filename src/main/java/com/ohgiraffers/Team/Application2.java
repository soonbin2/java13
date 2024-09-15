package com.ohgiraffers.Team;

public class Application2 {
    public static void main(String[] args) {
//        1. -50부터 50까지의 난수를 발생시키는 함수를 작성해보세요
        int random1 = (int) (Math.random() * 101) + (-50);
        System.out.println("random1 = " + random1);
    }
}
