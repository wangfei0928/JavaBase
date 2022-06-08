package com.lanou.java.day02;

import java.util.Random;

public class Day02Homework2 {
    /*
     * 2. 创建一个包含10个随机数的数组（源数组），随机数的取值范围是[10, 80]，
     *    将数组中的数据拷贝到一个新的数组中。
     *    数组的拷贝，涉及到2个数组,  一个是源数组，一个是目的数组，将源数组的数据拷贝到目的数组中。
     *    目的数组的容量（数组长度）要大于等于源数组的容量。所谓的拷贝，就是把源数组下标为0的元素赋值给目的数组下标为0的元素，
     *    把源数组下标为1的元素赋值给目的数组下标为1的元素，.....把源数组下标为length-1的元素赋值给目的数组下标为length-1的元素
     * */
    public static void main(String[] args) {
        Random random = new Random();
        int array[] = new int[10];
        for (int i = 0;i < array.length;i++){
            array[i] = random.nextInt(80 -10 + 1) + 10;
            System.out.print(+array[i]+" ");
        }
        System.out.println();
        int newArray[] = new int[array.length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i];
            System.out.print(newArray[i]+" ");
        }
    }
}
