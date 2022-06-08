package com.lanou.java.day02;

public class InsertArray {
    public static void main(String[] args) {

        //影响插入速度的核心因素是   插入位置，第二因素是数组长度。
        //如果在末尾插入数据，一次都不用移动,在下标为0的时候，移动次数是最多的
        //数组的特点  查找特别快。
        //查找的时候满足一个线性函数，因为数组在内存种是连续的存储空间，所以可以通过下标瞬间定位元素。
        //数组的另外一个特点： 增加、删除操作耗时。

        //需求，创建一个数量为10的数组，前7个{35,22,17,41,72,29,10}，将66插入第一个
        int array[] = {35,22,17,41,72,29,10,0,0,0};
        int num = 66;
        int index = 1;

        //倒着移动
        for (int i = array.length-1; i > index; i--){
            array[i] = array[i - 1];
        }
        //插入数组
        array[index] = num;
        for (int i = 0; i < array.length;i++){
            System.out.print(array[i]+" ");
        }

    }
}
