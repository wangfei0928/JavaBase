package com.lanou.java.day03;

import java.util.Scanner;

public class MethodEx {
    public static void main(String[] args) {
        isLegal();
        System.out.println(getInput(3,9,"输入非法，请输入3-9之间的数(含)"));
        System.out.println("位数为"+weishu(0));
        System.out.println("位数为"+bitsOfNum(156423));
    }

    /*
     * 设计一个方法，获取用户输入的数据。要求用户必须输入0~9之间的数，如果不是，让用户重新输入，直到用户输入的内容合法。
     * */
    public static int isLegal(){
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        do {
            System.out.println("请输入0-9之间的数字");
            num = scanner.nextInt();
            if (num >=0 && num <= 9){
                System.out.println(num);
                break;
            }else {
                System.out.println("输入的内容不合法，请重新输入");
            }
        }while (true);
        return  num;
    }

    /*
    设计一个方法计算数字是几位数。需要有参数和返回值，参数就是要计算位数的数字，返回值是位数
    */
    public static int weishu(int num){
        int bits = 0;
        while (num!=0){
            num/=10;
            bits++;
        }
        return  bits;
    }

    public static int getInput(int min ,int max,String errorMessage){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入"+min + "~" + max+"之间的数(含)");
        int num = scanner.nextInt();
        while(num > max || num < min){
            System.out.println(errorMessage);
            num = scanner.nextInt();
        }
        return num;
    }

    public static  int bitsOfNum(int num){
        int bits = 0;
        do {
            num /= 10;
            bits++;
        }while (num != 0);
        return  bits;
    }
}
