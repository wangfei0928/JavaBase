package com.lanou.java.day02;

public class DeleteArray {
    public static void main(String[] args) {
        //删除元素
        //创建一个数量为10的数组，前7个{35,22,17,41,72,29,10}，将素组下标为1的、
        int index = 1;
        int array[] = {35,22,17,41,72,29,10,0,0,0};
        for (int i = index ; i < array.length - 1; i++) {
            array[i] = array[i+1];
        }
        //把最后一个元素设为0
        array[array.length-1] = 0;
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
