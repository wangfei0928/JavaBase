package com.lanou.java.day01;

import java.util.Random;

public class RandomEx {
    //产生5个[10, 80]之间的随机数，输出产生的数，并求出最大的随机数。
    //随机产生5个[10, 80]之间的随机数，输出产生的数，并求出最小的数。

    public static void main(String[] args) {
        int max = 0;
        for (int i = 0; i < 5; i++) {
            Random random = new Random();
            int num = random.nextInt(70 + 1) + 10;
            System.out.println(num + " ");
            if (num > max) {
                max = num;
            }
        }

        System.out.println("max:" + max);
        int min = 100;   //初始值至少要比最大的值相等

        for (int i = 0; i < 5; i++) {
            Random random = new Random();
            int num = random.nextInt(70 + 1) + 10;
            System.out.println(num + "");
            if (min > num) ;
            min = num;
        }
        System.out.println("min:" + min);
    }


}

