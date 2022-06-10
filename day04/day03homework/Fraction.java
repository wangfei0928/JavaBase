package com.lanou.day04.day03homework;

public class Fraction {
    /*
    * 做一个分数类(五分之二,七分之三这样的分数). 包含分子和分母2个属性, 提供如下方法:
    * 计算当前分数与另外一个分数的和, 计算当前分数和另外一个分数的差,计算当前分数和另外一个分数的乘积,计算当前分数和另外一个分数的商.实现分数的约分功能.
    * */
    private int numerator;  //分子
    private int denominator; //分母

    public Fraction() {}

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public Fraction add(Fraction fraction){
        int fz = numerator * fraction.denominator + fraction.numerator * denominator;
        int fm = fraction.denominator * denominator;
        Fraction result = new Fraction(fz,fm);
        return  result;
    }
    public Fraction jianfa(Fraction fraction){
        int fz = numerator * fraction.denominator - fraction.numerator * denominator;
        int fm = fraction.denominator * denominator;
        Fraction result = new Fraction(fz,fm);
        return  result;
    }
    public Fraction chengfa(Fraction fraction){
        int fz = numerator * fraction.numerator;
        int fm = denominator * fraction.denominator;
        Fraction result = new Fraction(fz,fm);
        return  result;
    }
    public Fraction chufa(Fraction fraction){
        int fz = numerator * fraction.denominator;
        int fm = denominator * fraction.numerator;
        Fraction result = new Fraction(fz,fm);
        return  result;
    }

    /**
     * 约分
     */
    public void reduce(){
        int gongYueShu = gcd(numerator,denominator);
        numerator /= gongYueShu;
        denominator /= gongYueShu;
    }
    private int gcd(int x, int y){
        //先对两个数求绝对值
        x = Math.abs(x);
        y = Math.abs(y);

        //辗转相除法求最大公约数
        while (x % y != 0){
            int temp = x % y;  //获取余数
            //用y做被除数
            x = y;
            //用temp做除数
            y = temp;
        }
        return y;
    }

    public String toString() {
        return numerator + "/" + denominator ;
    }
}
