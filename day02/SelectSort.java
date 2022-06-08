package com.lanou.java.day02;

public class SelectSort {
    //选择排序
    public static void main(String[] args) {
        int arr[] = {67,42,88,16,25,3};
        //外层循环控制趟数
        for (int i = 0; i < arr.length-1; i++) {
            int index = i;//最小值坐标
            int min = arr[i]; //假设第一个数最小
            //内层循环遍历数组，找到最小值下标
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {  //如果发现更小的数
                    index = j;       //更新min的值
                    min = arr[j];     //更新index
                }
            }

            //交换元素
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }

    }
}
