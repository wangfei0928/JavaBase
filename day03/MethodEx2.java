package com.lanou.java.day03;

public class MethodEx2 {

    public static void main(String[] args) {
        System.out.println(countNum(1,100,7));
        printTriangle(5,'@',0);
        int array[] = {14,165,75,341,1,67,3,0};
        int arr[] = {1,4,5,6,7,9,11,14,56,77};
        printArr(bubbleSort(array));

    }

    /*
     * 设计一个方法，实现数7游戏，并调用方法测试结果是否正确。不要只能数7，实现数n游戏，n是一个0~9之间的数。
     * */
    public static int countNum(int min,int max,int num){
        int count = 0;
        for (int i = min; i < max; i++) {
            if (i % num == 0 || i / 10 ==num||i % 10 == num) {
                System.out.print("过 ");
                count++;
            }else {
                System.out.print(i+" ");
            }
        }
        return  count;
    }


    public static  void printTriangle(int row ,char img,int paddingLeft){
        for (int i = 0; i < row; i++) {
            //打印空格
            for (int j = 0; j < row - i -1 + paddingLeft; j++) {
                System.out.print(" ");
            }
            //打印符号
            for (int j = 0; j < i *2 + 1; j++) {
                System.out.print(img);
            }
            System.out.println();
        }
    }


    //封装冒泡排序
    public static int[] bubbleSort(int array[]){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length -1 -i; j++) {
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }


    //封装选择排序
    public static void  selectSort(int array[]){
        for (int i = 0; i < array.length - 1; i++) {
            int index = i; //最小值下标
            int min = array[i];  //假设第一个最小
            for (int j = i; j < array.length ; j++) {

                if (min > array[j]) {  //如果发现更小的数
                    index = j;       //更新min的值
                    min = array[j];     //更新index
                }
            }
            //交换元素
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }

    //封装打印数组
    public static void printArr(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
    }
    //冒泡排序
    public static boolean binarySearch(int array[], int num){
        int low = 0;
        int high = array.length - 1;
        int mid = (low+high)/2;
        boolean isFind = false;
        while (low <= high){
            if (mid == num){
                isFind = true;
                break;
            } else if (mid > num) {
                high = mid -1;
            }else {
                low = mid + 1;
            }
        }
        return isFind;
    }

}
