package com.lanou.java.day01;

import java.util.Random;
import java.util.Scanner;

public class Day01_homework {

    public static void main(String[] args) {
/*
        1. 产生5个[10,20]之间的随机数，输出产随生的数，并计算机数的和以及平均值。
*/
        int sum = 0;
        int average = 0;
        Random random  = new Random();
        for (int i = 0;i < 5;i++){
            int x = random.nextInt(20 -10 + 1) + 10;
            System.out.print(x + " ");
            sum += x;
        }
        average = sum / 5 ;
        System.out.println();
        System.out.println("随机数和:"+sum);
        System.out.println("平均数"+average);


        /*
         * 2.  世界上最高山峰是珠穆朗玛峰（8844.43米=8844430毫米），假如有一张足够大的纸，它的厚度是0.1毫米。
         * 请问折叠多少次，可以折成珠穆朗玛峰的高度？
         * */
        int count = 0;
        double paper =  0.1;
        while (paper <= 8844430){
            count++;
            paper = paper * 2;
        }
        System.out.println("需要折叠的次数：" + count);


        /*
        * 3. 如果你是一个富二代，你有10亿元（1000000000），每天花一半，多天可以花完。
        * */
        int myMoney = 1000000000;
        int day = 0;
        while (myMoney != 0){
            myMoney /= 2;
            day++;
        }
        System.out.println("需要"+day+"天花完");

        /*
        * 4. 猜数字。产生1个[10, 30]的随机数，从键盘上输入你的猜测结果，
        * 如果猜测的数比随机数大，提示"你猜的数据大了"，如果猜测的数比随机数小，提示"你猜测的数据小了"，
        * 如果猜测的数和随机数一样大，提示"恭喜你猜对了"，
        * 计算出猜了几次才猜对。
        * */
        int count2 = 0;
        int i = random.nextInt(30-10+1)+10;
        System.out.println("随机数为"+i);
        int guessNum;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入你猜测的数:");
            guessNum = scanner.nextInt();
            if (i > guessNum){
                System.out.println("你猜测的数据小了");
            }else if (i < guessNum){
                System.out.println("你猜的数据大了");
            }else {
                System.out.println("恭喜你猜对了");
            }
            count2++;
        } while (guessNum != i);
        System.out.println("你一共猜了"+count2+"次");

        /*
        * 5. 求1! + 2! + 3! + 4!的和是多少。
        * */
        int sum2 = 0;  //定义 和
        for (int k = 1;k <= 4;k++){      //从1开始
            int ret = 1;
            for (int j = 1; j <= k; j++) {
                ret *= j;
            }
            sum2 += ret;
        }
        System.out.println(sum2);
    }
}
