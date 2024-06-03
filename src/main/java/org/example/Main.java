package org.example;

import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        자동차 car1 = new 자동차();
        car1.자동차_속력 = 145;
        car1.자동차_최대속력 = 188;
        자동차 car2 = new 자동차();
        car2.자동차_속력 = 135;
        car2.자동차_최대속력 = 198;

        System.out.println("1번 자동차 속력 : " + car1.자동차_최대속력);
        System.out.println("2번 자동차 속력 : " + car2.자동차_최대속력);

        car1.달리다();
        car2.달리다();
    }
}

class 자동차{
    int 자동차_속력;
    int 자동차_최대속력;
    int[] 자동차_속력기록 = new int[3];
    void 달리다(){
        System.out.println(" 자동차가 최고속력 " + 자동차_최대속력 + "km로 달립니다.");
    }
}

