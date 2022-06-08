package com.lanou.java.day01;

import java.util.Scanner;

public class if3 {
    public static void main(String[] args) {
        /*
         * 需求：根据考试成绩计算应该给与什么奖励：
         * 考试100分，奖励一架航拍遥控飞机；
         * 考试90分~99分，奖励游乐场玩一次；
         * 考试80分~89分，奖励玩具赛车一辆；
         * 考试70分~79分，奖励玩手机30分钟；
         * 考试70分以下，挨揍一顿。
         * */
        System.out.println("请输入一个数");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        if (score == 100) {
            System.out.println("奖励一架航拍遥控飞机");
        } else if (score > 90) {
            System.out.println("奖励游乐场玩一次");
        } else if (score > 80) {
            System.out.println("奖励玩具赛车一辆");
        } else if (score > 70) {
            System.out.println("奖励玩手机30分钟");
        } else {
            System.out.println("挨揍一顿");
        }
        /*
         * 出租车计费标准为：
         * 3公里以内10元，
         * 3公里以后每1公里加2元，
         * 超过15公里，每1公里加3元。
         * 请输入一个最终公里数，计算应付的车费。
         * */
        System.out.println("请输入一个距离");
        int distance = scanner.nextInt();
        int money = 0;
        if (distance < 3) {
            System.out.println("车费为10元");
        } else if (distance < 15) {
            money = 10 + (distance - 3) * 2;
        } else {
            money = 10 + (distance - 15) * 3;
        }
        System.out.println(money);
    }
}
