package com.lanou.java.day01;

public class flower {
    public static void main(String[] args) {
        //在控制台打印出所有的水仙花数。水仙花数：是一个三位数，水仙花数的个位、十位、百位数字的立方之和等于原数。
        for (int l = 100; l < 999;l++){

            int i = l / 100;  //百位
            int j = l %100 /10; //十位
            int k = l % 10;   //个位
            if (i*i*i+j*j*j+k*k*k == l){
                System.out.println(l+"是水仙花数");
            }
        }
    }
}
