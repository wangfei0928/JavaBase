package com.lanou.java.day02;

public class Day02Homework1 {
    public static void main(String[] args) {
        /*
        * 1.需求：有2个数组数据分别是：{15, 7, 22, 13, 40} , {15, 7, 22, 15, 40}，
        *   编写代码判断数组是否相等。数组相等指的是数组长度相等，并且对应下标的元素也相等。
        *   即判断数组相等的指标有2个：1.数组长度相等；2.对应位置的元素相等。
        * */

        int array1[] = {15, 7, 22, 13, 40};
        int array2[] = {15, 7, 22, 15, 40};
        boolean isEquals = true;

        if (array1.length == array2.length){
            for (int i = 0; i < array1.length;i++){
                if (array1[i] != array2[i]){
                    isEquals = false;
                    break;
                }
            }
            if (isEquals) {
                System.out.println("两数组相等");
            }else {
                System.out.println("两数组不相等");
            }
        }else {
            System.out.println("两数组不相等");
        }


    }
}
