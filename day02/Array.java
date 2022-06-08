package com.lanou.java.day02;

public class Array {

    public static void main(String[] args) {
        /*
        数组是一个容器，用于存放相同数据类型的一组数据
        数组不属于基本类型，属于引用类型

        数组定义
        数据类型 [] 数组名 = 初始值
        */

        //数组的初始化
        //1. 动态初始化，创建数组的时候，只指定大小，不指定内容，内容由后期填充
        //没有指定内容，数组元素会有默认值，整数（byte,short,int,long）是0，小数(float,double)是0.0,布尔是false,字符是'0'(ASCII为0的字符)
        int [] array = new int[5];
        char [] chars = new char[5];
        System.out.println(chars[0]);
        //2. 静态初始化，在创建数组的时候，就指定了元素的内容，元素个数是由内容推断出来的 ---不能既指定元素个数，又指定内容
        int arrays[] = new int[]{1,2,3,4,5};
        int array2[] = {1,2,3,4,5};    //静态初始化可以简写。
        System.out.println(arrays[2]);
        System.out.println(arrays); //数组名代表的是 系统开辟的 内存地址的起始地址。

//        数组是定长的容器，创建的时候多大空间，以后就多大空间，不可以改变。
//        优势：性能高。劣势：不能扩容 数组长度 = 数组名.length
//        如何访问数组元素：访问分为2种情形： 给元素赋值， 读取（使用）元素的值
        array2[2] = 100;  //给数组元素复制

        System.out.println(array2[2]); //读取、访问数组元素的值

//        System.out.println(array2[100]);  //java.lang.ArrayIndexOutOfBoundsException : 100

        /*
            array = null;
            System.out.println(array[0]); //Exception in thread "main" java.lang.NullPointerException
        */


        //数组遍历
        for (int i = 0; i < array2.length;i++){
            System.out.print(array2[i] + " ");
        }
        System.out.println();

//        在数组中查找元素有2种方式。
//        方式一：遍历数组进行查找----顺序查找--适用于任何情况。
//        方式二：折半查找（二分法查找）。----要求数组必须有序。

        //冒泡排序
        //n个元素，要排n-1趟  n=6
        //第一趟 比较n-1次    5
        //第二趟             n-2
        // 3                n-3

        int arr[] = {67,42,88,16,25,3};
        //外层循环控制趟数
        for (int i = 0; i < arr.length-1; i++) {
            //内层循环比较次数
            for (int j = 0; j < arr.length - 1 -i; j++) {
                if (arr[j] > arr[j+1]) {
                    //二者交换
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}
