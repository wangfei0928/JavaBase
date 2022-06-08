package com.lanou.java.day01;

import java.util.Scanner;

public class JavaBaseReview {

    public static void main(String[] args) {
        //Scanner是一个定义好的封装类，在java.util包里
        //Scanner 的作用，从控制台或者或文件里，提取指定类型的数据
        //简单来说，可以把键盘输入的类型，读成整形，字符串，布尔型
        //创建参数的时候需要一个参数，这个参数是一个流对象，

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入0-3的整数");
        //把键盘缓存区里的内容以整形的方式提取出来
        /* int i = scanner.nextInt();
        String str = scanner.next();

        System.out.println(i);
        System.out.println(str);*/

        int num = scanner.nextInt();
        switch (num){
            case 1:
                System.out.println("进入购物车");
                break;
            case 2:
                System.out.println("进入订单模块");
                break;
            case 3:
                System.out.println("进入xX模块");
                break;
            case 0:
                //退出时确认一下
                System.out.println("确定退出吗，Y/N");
                scanner.nextLine();
                String str = scanner.nextLine();
                if (str.equals("Y")){
                    System.out.println("退出");
                }
                else {
                    System.out.println("不退出，继续");
            }

        }

    }
}
