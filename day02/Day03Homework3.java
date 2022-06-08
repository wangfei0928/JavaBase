package com.lanou.java.day02;

import java.util.Random;

public class Day03Homework3 {
    public static void main(String[] args) {
        /*
        * 创建一个包含10个随机数的数组，每个随机数的范围是[10, 80]，
        * 实现数组元素翻转。数组的翻转指的是：数组元素颠倒一下，
        * 即数组第一个元素和最后一个元素互换，第二个元素和倒数第二个元素互换，...
        * */

        int [] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(80 - 10 +1) + 10;
            System.out.print(array[i]+" ");
        }
        System.out.println();
        int [] newArray = new int[array.length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[array.length-1-i];
            System.out.print(newArray[i]+" ");
        }

    }
}
