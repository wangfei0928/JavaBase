package com.lanou.java.day02;

import java.util.Random;

public class Array2DSort {
    public static void main(String[] args) {
        /*
         * 需求：创建一个3行5列的二维数组，每个元素的取值范围是[30, 70]，对第2列的数据按从小到大排序。
         * */
        Random random = new Random();
        int[][] array = new int[3][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(70 - 30 + 1) + 30;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        //可以把第二列想象成一个数组  (虚拟数组)
        //冒泡排序

        for (int i = 0; i < array.length -1; i++) {
            for (int j = 0; j < array.length -1 - i; j++) {
               if (array[j][1] >array[j+1][1]){
                   int temp = array[j][1];
                   array[j][1] = array[j+1][1];
                   array[j+1][1] = temp;
               }
            }
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
