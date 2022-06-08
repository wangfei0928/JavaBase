package com.lanou.java.day01;

public class maiji {
    public static void main(String[] args) {
        int money = 100;
        int gongjimoney = 5;
        int mujimoney = 3;
        int xiaojimoney = 1;
        for (int gongjinum = 0; gongjinum <= 20; gongjinum++) {
            for (int mujinum = 0; mujinum <= 33; mujinum++) {
                for (int xiaojinum = 0; xiaojinum <= 100; xiaojinum += 3) {
                    if ((gongjimoney * gongjinum + mujimoney * mujinum + xiaojimoney * xiaojinum / 3 == money) && (gongjinum + mujinum + xiaojinum == 100)) {
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
