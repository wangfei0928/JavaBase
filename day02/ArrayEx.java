package com.lanou.java.day02;

import java.util.Random;

public class ArrayEx {
    public static void main(String[] args) {

        /*
         * 有一组数据 10，8，23，41，52，66，34，12。编写代码求出数组中的最大值。
         * */
        int array[] = new int[]{10, 8, 23, 41, 52, 66, 34, 12};
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("最大值为：" + max);

        /*
         * 有一个具有10个int 数据的数组，数组中的每个元素都是[10, 100]之间的随机数。编写代码求出数组中的最大值，最大值下标。
         * */
        Random random = new Random();
        int max2 = 0;
        int array2[] = new int[10];
        for (int i = 0; i < 10; i++) {
            array2[i] = random.nextInt(15 - 10 + 1) + 10;
            System.out.print(array2[i] + " ");
        }

        for (int i = 0; i < 10; i++) {
            if (max2 < array2[i]) {
                max2 = array2[i];
            }
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            if (max2 == array2[i]) {
                System.out.print("下标：" + i + " ");
            }
        }
        System.out.println("最大值为：" + max2);


        /*
         * 有一个包含10个元素的数组，每个元素的值在[10,30]之间，查找数组中是否包含18，如果有18，打印出值为18的元素的下标。
         * 如果没有18，打印“数组中不包含18”。
         * */

        int array3[] = new int[10];
        //记录是否包含18 ，假定不包含
        boolean isContain = false;
        for (int i = 0; i < array3.length; i++) {
            array3[i] = random.nextInt(30 - 10 + 1) + 10;
            System.out.print(array3[i] + " ");
        }
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] == 18) {
                isContain = true;
            }
        }
        if (isContain) {
            for (int i = 0; i < array3.length; i++) {
                if (array3[i] == 18) {
                    System.out.print("index：" + i);
                    System.out.println();
                }
            }
        } else {
            System.out.println();
            System.out.println("不包含18");
        }

        /*
        * 需求：有一组已经排好顺序的数据：5，13，19，21，37，56，64，75，80，88，92。编写代码查询数组中是否包含数据78，21，13。
            1。使用顺序查找
            2。使用折半查找。
        * */
        System.out.println("----------------------------");
        // 1。使用顺序查找
        boolean flag1 = false; //记录是否包含78
        boolean flag2 = false; //记录是否包含21
        boolean flag3 = false; //记录是否包含13
        int arr[] = {5, 13, 19, 21, 37, 56, 64, 75, 80, 88, 92};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 78) {
                flag1 = true;
            }
            if (arr[i] == 21) {
                flag2 = true;
            }
            if (arr[i] == 13) {
                flag3 = true;
            }
        }
        if (flag1) {
            System.out.println("包含78");
        } else {
            System.out.println("不包含78");
        }
        if (flag2) {
            System.out.println("包含21");
        } else {
            System.out.println("不包含21");
        }
        if (flag3) {
            System.out.println("包含13");
        } else {
            System.out.println("不包含13");
        }

        System.out.println("---------------------------------");
        //方法二：使用折半查找。
        int low = 0;
        int height = arr.length - 1;
        boolean target1 = false;
        while (low <= height) {
            int mid = (low + height) / 2;
            if (arr[mid] == 78) {
                target1 = true;
                break;
            } else if (arr[mid] > 78) {
                height = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (target1) {
            System.out.println("包含78");
        } else {
            System.out.println("不包含78");
        }

        int low2 = 0;
        int height2 = arr.length - 1;
        boolean target2 = false;
        while (low2 <= height2) {
            int mid = (low2 + height2) / 2;
            if (arr[mid] == 21) {
                target2 = true;
                break;
            } else if (arr[mid] > 21) {
                height2 = mid - 1;
            } else {
                low2 = mid + 1;
            }
        }

        if (target2) {
            System.out.println("包含21");
        } else {
            System.out.println("不包含21");
        }


        int low3= 0;
        int height3 = arr.length - 1;
        boolean target3 = false;
        while (low3 <= height3) {
            int mid = (low3 + height3) / 2;
            if (arr[mid] == 13) {
                target3 = true;
                break;
            } else if (arr[mid] > 13) {
                height3 = mid - 1;
            } else {
                low3 = mid + 1;
            }
        }

        if (target3 == true) {
            System.out.println("包含13");
        } else {
            System.out.println("不包含13");
        }

    }
}
