package com.lanou.java.day02;

import java.util.Random;

public class Array2DEx {
    public static void main(String[] args) {
//        创建一个3行5列的二维数组，每个元素的取值范围是[30, 70]，求数组中的最大值以及最大值的下标。
        Random random = new Random();
        int sum = 0;//存放第四列的和
        int sum2 = 0;  //存放第二行的和
        int array[][] = new int[3][5];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = random.nextInt(70-30+1)+30;
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
        int max = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (max < array[i][j]){
                    max = array[i][j];
                }
                if (j == 3){
                    sum +=array[i][j];
                }
                if(i ==1){
                    sum2 +=array[i][j];
                }
            }
        }
        System.out.println("max:"+ max);
        System.out.println(sum);
        System.out.println(sum2);
        System.out.println("avg= " + sum*1.0/array.length);
        System.out.println("avg=" + sum2*1.0/array[0].length);


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (max == array[i][j]){
                    System.out.println("坐标为：[" + i +"," + j+"]");
                }
            }
        }



    }
}
