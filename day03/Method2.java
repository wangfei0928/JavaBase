package com.lanou.java.day03;

public class Method2 {
    public static void main(String[] args) {

        /*
        * 方法重载：在同一个类中，有两个或者更多的方法，具有相同的方法名，但是参数类型或者参数个数不相同， 这样的方法成为方法重载。
        * 注意：方法重载只看方法名和参数，不看返回值
        *   C语言不支持方法重载，有一系列求绝对值的函数
        *   例如： abs(整数) fabs(小数) dabs(double)
        * 有了方法重载，减少了开发者的记忆成本，解决了命名危机问题。
        *
        * 方法重写：在继承关系里，有一个父类，有一个子类，子类可以继承父类所有的属性和方法
        * 如果子类不满足父类某个方法的实现，或者不满足子类的需求，子类可以在父类方法的基础上，重写父类方法
        *
        * 在java里所有  from  to结构的参数， 都是包含from不包含to 【from,to)
         * */

        /*
        * 不定参数的方法，方法的参数个数是不定的，动态的。
        * 在不定参数方法中， 最多只能定义一个不定参数
        * 在方法里， 固定参数 写前面。不定参数写末尾，而且有且只能有一个不定参数。
        * */
       int result =  sum(2,34,4,5,6,72324,45);
        System.out.println(result);

        System.out.println(calculate("sum",1,23,4));
        System.out.println(calculate("leijia",1,3));
        System.out.println(calculate("leicheng",1,3));
        System.out.println(calculate("chengji",1,2,5,6));

        int array[] = {11,35,6,845,45,77,2,3};
        System.out.println(indexOfNum(array,2,5,3));


    }
    /*public static int sum(int x,int y) {
        return x + y;
    }
    public static int sum(int x,int y,int z) {
        return x + y + z;
    }
    public static double sum(double x,int y) {
        return x + y;
    }*/

    public static int sum(int x,int ...nums){
        int result = 0;
        for (int i = 0; i < nums.length;i++){
            result += nums[i];
        }
        return result;
    }

    public static int calculate(String option,int ...num){
        int result = 0;
        switch (option){
            case "sum":
                for (int i = 0; i < num.length; i++) {
                    result += num[i];
                }
                break;
            case "leijia":
                for (int i = num[0]; i <= num[1]; i++) {
                    result += i;
                }
                break;
            case "leicheng":
                result =1;
                for (int i = num[0]; i <= num[1]; i++) {
                    result *= i;
                }
                break;
            case "chengji":
                result = 1;
                for (int i = 0; i < num.length; i++) {
                    result *= num[i];
                }
        }
        return result;
    }
    public static int indexOfNum(int arr[],int offSet,int count,int num){
        //假定-1 没有找到
         int index = -1;
        for (int i = offSet; i <= offSet+count; i++) {
            if (num == arr[i]){
                index = i;
                break;
            }
        }
         return index;
    }
}
