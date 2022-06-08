package com.lanou.java.day01;

import java.util.Scanner;

public class FenZhi {
    public static void main(String[] args) {
        /*
         * if 分支:  一共有三种形式
         * if(条件表达式){
         *   代码
         * }
         * 如果条件表达式为真,才会执行大括号里面的代码,如果表达式为false,跳过大括号里面的内容
         *
         * */
//        需求：输入两个数，代表“斗地主”游戏中的牌的点数，分别用变量a和b接收。如果 a 和 b相等，就输出“你摸了一个对子”。
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个数:");
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        if (i == j) {
            System.out.println("你摸到一个对子:");
        }


        /*1.需求：输入3个数，分别用变量a,b,c接收。如果a > b，输出"a > b"，如果a > c，输出“a > c”*/

        System.out.print("输入a:");
        int a = scanner.nextInt();
        System.out.print("输入b:");
        int b = scanner.nextInt();
        System.out.print("输入c:");
        int c = scanner.nextInt();

        if (a > b) {
            System.out.println("a>b");
        }
        if (a > c) {
            System.out.println("a>c");
        }

        /*有一个变量num，初始值是23。输入一个整数，如果输入的数字大于23，将num改为输入的数。*/
        int num = 23;
        System.out.println("输入一个数：");
        int d = scanner.nextInt();
        if (d > num) {
            num = d;

        }
        System.out.println(num);
    }


}
