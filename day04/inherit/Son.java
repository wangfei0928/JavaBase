package com.lanou.day04.inherit;

public class Son extends Father{
    private int a = 100;  //a 只能在本类通过点语法调用
    int b = 200;
    protected  int c = 300;
    public int d =  400;


    public void test(){
        System.out.println("d="+d);
        System.out.println("d="+this.d);
        System.out.println("d="+super.d);
    }
    public Son(){
        System.out.println("子类无参构造方法");

    }
    public Son(int a, int b, int c, int d) {
        super(a, b, c, d);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        System.out.println("子类有参构造");
    }

    public void method1(){
        System.out.println("我是子类中的方法");
    }
    protected void method2(){
        System.out.println("我是子类中的方法 protected");
    }
    void method3(){
        System.out.println("我是子类中的方法   缺省");
    }
    private void method4(){
        System.out.println("子类 private");

    }


}
