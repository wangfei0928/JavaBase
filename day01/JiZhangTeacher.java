package com.lanou.java.day01;

import java.util.Scanner;

/**
 * @author lanou_cyy
 * @create 2022-06-08
 */
public class JiZhangTeacher {
    public static void main(String[] args) {

        //账户余额
        int balance = 10000;
        //明细
        String detail = "收支\t账户金额\t收支金额\t说   明\n";


        //循环执行程序功能
        boolean isExit = false;//定义一个布尔变量，来控制循环的运行。
        while (isExit == false){
            //打印菜单
            System.out.println("-----------------家庭收支记账软件-----------------");
            System.out.println();
            System.out.println("                   1 收支明细");
            System.out.println("                   2 登记收入");
            System.out.println("                   3 登记支出");
            System.out.println("                   4 退    出");
            System.out.println();
            System.out.print("                   请选择(1-4)：");

            //获取用户输入的编号
            Scanner scanner = new Scanner(System.in);
            int menuId = scanner.nextInt();
            //通过while循环限制用户输入的内容。
            while(menuId > 4 || menuId < 1){
                System.out.print("功能编号有误，请重新输入（1-4）：");
                menuId = scanner.nextInt();
            }
            //根据功能编号，进入不同的功能模块
            switch (menuId){
                case 1:
                    System.out.println("-----------------当前收支明细记录-----------------");
                    System.out.println(detail);
                    System.out.println("-----------------------------------------------");
                    break;
                case 2: {
                    System.out.print("本次收入金额：");
                    //获取用户输入的收入金额
                    int income = scanner.nextInt();
                    while (income <= 0){
                        System.out.print("收入金额必须大于0，请重新输入：");
                        income = scanner.nextInt();
                    }

                    //吃掉回车
                    scanner.nextLine();//清空键盘缓存区
                    System.out.print("本次收入说明：");
                    //获取用户输入的说明
                    String comment = scanner.nextLine();
                    //更新账户余额
                    balance += income;
                    //追加明细
                    detail += "收入\t" + balance + "\t" + income + "\t" + comment + "\n";
                    System.out.println("收入登记成功！！");
                    break;
                }
                case 3:
                    System.out.print("本次支出金额：");
                    //获取用户输入的收入金额
                    int pay = scanner.nextInt();
                    while (pay <= 0){
                        System.out.print("收入金额必须大于0，请重新输入：");
                        pay = scanner.nextInt();
                    }
                    //吃掉回车
                    scanner.nextLine();//清空键盘缓存区
                    System.out.print("本次支出说明：");
                    //获取用户输入的说明
                    String comment = scanner.nextLine();
                    //更新账户余额
                    balance -= pay;
                    //追加明细
                    detail += "支出\t" + balance + "\t" + pay + "\t" + comment + "\n";
                    System.out.println("支出登记成功！！");
                    break;
                case 4:
                    //吃掉4后面的回车。
                    scanner.nextLine();//相当于清空了 键盘缓存区。
                    System.out.print("确认是否退出(Y/N)：");
                    //获取用户输入的确认信息
                    String yesOrNo = scanner.nextLine();
                    //判断是否真的退出
//                    if (yesOrNo.equals("Y")){
//                        isExit = true;
//                    }
                    if (yesOrNo.equalsIgnoreCase("Y")){
                        isExit = true;
                    }
                    break;
            }

        }

    }
}
