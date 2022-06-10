package com.lanou.day04.inherit;
/*
* 通过继承设计枪（Gun）和匕首（Dagger）类。枪和匕首都有名称、攻击力、价格。枪可以发射子弹(fire)，能更换弹夹(reload)；匕首可以攻击(attack)。
* */
public class Weapen {

    private String name;
    private double gonjili;
    private double price;

    public Weapen() {
    }

    public Weapen(String name, double gonjili, double price) {
        this.name = name;
        this.gonjili = gonjili;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGonjili() {
        return gonjili;
    }

    public void setGonjili(double gonjili) {
        this.gonjili = gonjili;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Weapen{" +
                "name='" + name + '\'' +
                ", gonjili=" + gonjili +
                ", price=" + price +
                '}';
    }
}
