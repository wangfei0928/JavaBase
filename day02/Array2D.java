package com.lanou.java.day02;

public class Array2D {
    public static void main(String[] args) {
        //动态初始化
        int[][] arr= new int[3][4];

        //静态初始化
        int [][] array= {{12,3,4,5},{1,3,4,5,7,34}};
        //java的二维数组和c语言的二维数组不同。
        //C语言里二维数组的内存空间是连续的。
       /* Java中二维数组内存是不连续的。
        二维数组的本质是： 一个存放了很多一维数组的数组。*/
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
