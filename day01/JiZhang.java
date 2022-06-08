package com.lanou.java.day01;

import java.util.Scanner;

public class JiZhang {
    public static int count = 10000; //定义全局变量账户金额为10000;
    public static int outcome; //支出金额
    public static int income; //收入金额
    public static String outcomeStr;//支出说明
    public static String incomeStr; //收入说明


    public static void main(String[] args) {
        menu();
    }

    //账单明细输出
    public static void printDetail() {
        String outDetail = "支出\t\t" + count + "\t\t" + outcome + "\t\t" + outcomeStr;
        String inDetail = "收入\t\t" + count + "\t\t" + income + "\t\t" + incomeStr;
        System.out.println(outDetail);
        System.out.println(inDetail);
    }

    //账单明细
    public static void detail() {
        System.out.println("-----------------当前收支明细记录-----------------");
        System.out.println("收支\t\t账户金额\t\t收支金额\t\t说\t明");
        printDetail();
        menu();
    }

    //账单支出
    public static int outcome() {
        System.out.print("本次支出金额:");
        Scanner scanner = new Scanner(System.in);
        //获取支出金额
        outcome = scanner.nextInt();
        System.out.print("本次支出说明:");
        outcomeStr = scanner.next();
        System.out.println("收支\t\t账户金额\t\t收支金额\t\t说\t明");
        //更新账户金额
        count = count - outcome;
        String outDetail = "支出\t\t" + count + "\t\t" + outcome + "\t\t" + outcomeStr;
        System.out.println(outDetail);
        menu();
        return count;
    }

    //账单收入
    public static int income() {
        System.out.print("本次收入金额:");
        Scanner scanner = new Scanner(System.in);
        income = scanner.nextInt();
        System.out.print("本次收入说明:");
        incomeStr = scanner.next();
        System.out.println("收支\t\t账户金额\t\t收支金额\t\t说\t明");
        count = count + income;
        String inDetail = "收入\t\t" + count + "\t\t" + income + "\t\t" + incomeStr;
        System.out.println(inDetail);
        menu();
        return count;
    }

    //菜单
    public static void menu() {
        System.out.println("-----------------家庭收支记账软件-----------------");
        System.out.println("\t\t\t1.收支明细");
        System.out.println("\t\t\t2.登记收入");
        System.out.println("\t\t\t3.登记支出");
        System.out.println("\t\t\t4.退   出");
        System.out.print("请选择(1-4):");
        Scanner scanner = new Scanner(System.in);
        int flag = scanner.nextInt();

        //通过while循环限制用户输入的内容
        while (flag > 4 || flag < 1){
            System.out.print("输入有误，请重新输入(1-4):");
            flag = scanner.nextInt();
        }

        Boolean isExit = false; //这是一个布尔变量，用于控制循环
        while (isExit == false){

            switch (flag) {
                case 1:
                    System.out.println();
                    System.out.println("收支明细");
                    detail();
                    break;
                case 2:
                    System.out.println();
                    System.out.println("登记收入");
                    income();
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    System.out.println("登记支出");
                    outcome();
                    System.out.println();
                    break;
                case 4:
                    //吃掉后面的回车
                    scanner.nextLine();//相当于清空了缓存区中的内容
                    System.out.print("你确定要退出吗? Y/N:");
//                scanner.nextLine();   也可以在这里清空
                    //获取键盘缓存区的内容
                    String str = scanner.nextLine();
//                if (str.equals("Y")) {
//                    System.out.println("成功退出");
                    if (str.equalsIgnoreCase("y")){
                        isExit = true;
                    } else {
                        menu();
                    }

            }

        }

    }
}
