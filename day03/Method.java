package com.lanou.java.day03;

public class Method {
    public static void main(String[] args) {
        /*
        * 方法分为四类：
        * 1. 无参无返回值 修饰符 void 方法名(){}
        * 2. 无参有返回值 修饰符 返回值类型 方法名(){}
        * 3. 有参无返回值 修饰符 void 方法名(参数列表){}
        * 4. 有参有返回值 修饰符 返回值类型 方法名(参数列表){}
        *
        * 还可以这么分类：
        * 1. 系统方法： 系统提供好的一些类，这些类中已经有的方法，称为系统方法。
        * 2. 自定义方法：根据需要自己写的方法
        *
        *
        *  有没有返回值决定了方法的运行结果能不能被拿到。
        *  如果没有返回值，那么方法只是在执行一个功能，并没有任何内容返回给你。
        *  如果有返回值，那么方法不但执行一个功能，还会返回一个执行结果。
        *  尽量我们提供返回值。
        *
        * 如果一个方法有返回值，那么调用的时候可以有两个选择。
        * 第一：使用返回值（定义一个变量保存一下返回值）。
        * 第二：不使用返回值（直接调用方法，不定义变量接收返回值）。
        * 如果方法没有返回值，那么你想用结果都用不了！
        *
        * 形参：形式参数，出现在方法定义时，占位用的，再定义方法的时候，我们并不知道参数的值是多少，但是我们知道需要对参数进行使用
        * 实参：实际参数,在调用方法的时候，实际传入的参数。
        * 实参-->形参   是单向的值拷贝的过程。
        *
        * 如果实参是引用类型，那么数据会同步更新
        * 如果实参是基本类型，那么数据不会同步更新
        * */
        printHello();

        double pi = PI();
        System.out.println(pi);

        System.out.println(PI());

        double area = 10* 10* PI();
        System.out.println(area);

        sum();

        int a = sum2();
        if (a %2 ==0){
            System.out.println("结果是偶数");
        }else{
            System.out.println("结果是奇数");
        }

        say("helloword");
        chengji(5,3);
        chengji(4,3);

        int chengji = chengji2(5,8);
        System.out.println(chengji+2);

        int x =10; int y =20;
        System.out.println("x="+x+" y="+y);
        swap(x,y);
        System.out.println("x="+x+" y="+y);

        int array[] = {10,20};
        System.out.println("交换之前：array[0]="+array[0]+",array[1]="+array[1]);
        swap2(array);
        System.out.println("交换之后：array[0]="+array[0]+",array[1]="+array[1]);

        int arr[] = new int[]{10,30};
        System.out.println("交换之前：array[0]="+arr[0]+",array[1]="+arr[1]);
        swap3(arr[0],arr[1]);
        System.out.println("交换之后：array[0]="+arr[0]+",array[1]="+arr[1]);
    }

    public static void swap3(int x,int y){
        int temp =x;
        x = y;
        y = temp;
    }

    //交换
    public static void swap2(int array[]){
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }
    //无参无返回值的方法
    public static void printHello(){
        System.out.println("hello");
    }

    //无参有返回值的方法
    public static double PI(){
        return 3.1415926;
    }

    //计算1+2+3+4+......+100
    public static void sum(){
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static int sum2(){
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }

    //有参无返回值
    public static void say(String something){
        System.out.println(something);
    }

    public static void chengji(int x, int y){
        int a = x * y;
        System.out.println(a);
    }

    //既有参数又有返回值
    public static int chengji2(int x,int y){
        int result = x * y;
        return result;
    }
    //交换两个值
    public static void swap(int x ,int y){
        System.out.println("x:"+x+" y:"+y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("x:"+x+" y:"+y);
    }




}
