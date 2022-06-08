package com.lanou.java.day01;

import java.util.Scanner;

public class Cycle {
    public static void main(String[] args) {
        /*
            for(表达式1;表达式2;表达式3;){
            循环体;
            }
        */

        //for循环只有一种使用场景， 循环次数已知;
//        for循环的使用频率最高，达到80%
        //求1.。。。10的和
      /*  int sum = 0;  //表示和
        for (int i = 1;i <=10;i++){
            sum +=i;
        }
        System.out.println("sum="+sum);


        //在控制台打印出所有的水仙花数。水仙花数：是一个三位数，水仙花数的个位、十位、百位数字的立方之和等于原数。
        for (int l = 100; l < 999;l++){

            int i = l / 100;  //百位
            int j = l %100 /10; //十位
            int k = l % 10;   //个位
            if (i*i*i+j*j*j+k*k*k == l){
                System.out.println(l+"是水仙花数");
            }
        }

        //数7游戏。从1到100（不含100），如果数是7的倍数或者包含7输出“过”，否则输出数字本身。
        for (int z = 0;z < 100;z++){
            if (z % 7 == 0 || z % 10 ==7||z /10 == 7){
                System.out.print("过 ");
            }else {
                System.out.print(z+ " ");
            }
        }

        //输入一个整数，判断是几位数。
        System.out.println("请输入一个整数：");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int suma =0;
        if (i==0){
            System.out.println("0是一位数");
        }else {
            while(i!=0){
                i = i / 10 ;
                suma++;
            }
            System.out.println(suma);
        }

        //输入一个整数
        System.out.println("输入一个整数");
        int j = scanner.nextInt();
        int count = 1;
        while (j/10!=0){
            j /=10;
            count++;
        }
        System.out.println(count);*/

        //1
        //1 2
        //1 2 3
        //...........

        for (int i = 0; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("-----------");
        //打印倒三角
        for (int i = 5; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------------");
        int num = 4;
        int paddingLeft = 15;
        char symbol = '@';
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i - 1+paddingLeft; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i * 2 + 1); k++) {
                System.out.print(symbol);
            }
            System.out.println(" ");
        }

        //百钱买百鸡
        /*
        * 我国古代数学家张邱建在《算经》中出了一道“百钱买百鸡”的问题，题意是这样的：
        * 5文钱可以买一只公鸡，3文钱可以买一只母鸡，1文钱可以买3只小鸡。
        * 现在用100文钱买100只鸡，那么各有公鸡、母鸡、小鸡多少只？请编写程序实现。
        * */

        int money = 100;
        int gongjimoney = 5;
        int mujimoney = 3;
        int xiaojimoney = 1;
        for (int gongjinum = 0;gongjinum <= 20;gongjinum++){
            for (int mujinum = 0;mujinum <= 33; mujinum++){
                for (int xiaojinum = 0;xiaojinum <= 100; xiaojinum += 3){
                    if ((gongjimoney*gongjinum + mujimoney*mujinum + xiaojimoney*xiaojinum/3 ==money) && (gongjinum+mujinum+xiaojinum==100)){
                        System.out.print("公鸡个数:" + gongjinum);
                        System.out.print("母鸡个数:" + mujinum);
                        System.out.print("小鸡个数:" + xiaojinum);
                        System.out.println();
                    }

                }
            }

        }
    }

}
