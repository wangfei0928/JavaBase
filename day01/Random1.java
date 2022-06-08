package com.lanou.java.day01;

public class Random1 {
    public static void main(String[] args) {

        //随机数类 Ramdom是一个伪随机
        //伪随机：看着随机，实际上不随机
        //Random会根据seed(种子)，生成一个数列，只要种子不变，数列永远不变
        java.util.Random random = new java.util.Random(100); //括号不加参数的话，按照系统时间作为种子
        for (int i = 0; i < 5; i++) {
//          int num = random.nextInt();//获取一个随机数，
            //生成一个【min, max】的随机数  int n = r.nextInt(max - min + 1) + min
            int num1 = random.nextInt(20);   //范围是【0 - 20）
            int num2 = random.nextInt(16) + 12;   //[12,27]
            System.out.print(num1 + " ");
        }

    }

}
