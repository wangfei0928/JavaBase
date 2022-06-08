package com.lanou.java.day01;

import java.util.Scanner;

public class if2 {
    public static void main(String[] args) {
        /*
         * if的语法格式2
         * if(条件表达式){
         *   代码1
         * }else{
         *   代码2
         * }
         *
         * 如果条件表达式为true，执行代码1，如果表达式为false  执行代码2
         * */

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println("该数是偶数");
        } else {
            System.out.println("该数是奇数");
        }

        System.out.println("请输入年份");
        int i = scanner.nextInt();
        if (i % 400 == 0 || i % 4 == 0) {
            System.out.println("是闰年");
        } else if (i % 4 == 0 && i % 100 != 0) {
            System.out.println("是闰年");
        } else {
            System.out.println("是平年");
        }

        /*
         *       按位与 &
         *       00000000 00000000 00000001
         *       00000000 00000000 00001111
         * ---------------------------------
         *       00000000 00000000 00000001
         *
         *       提升性能
         * */
        System.out.println("请输入一个数:");
        int i1 = scanner.nextInt();
        if ((i1 & 1) == 1) {
            System.out.println("输入的数是奇数");
        } else {
            System.out.println("输入的数是偶数");
        }

    }
}
