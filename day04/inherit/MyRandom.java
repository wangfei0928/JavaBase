package com.lanou.day04.inherit;

import java.util.Random;

public class MyRandom extends Random {

    //不但可以继承父类的所有属性和方法，也可以添加自己的方法

    public int nextInt(int min,int max){
        int num = nextInt(max- min +1) +min;
        return num;
    }
}
