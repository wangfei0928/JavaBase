package com.lanou.day04.inherit;

public class Gun extends Weapen{
/*
* 枪和匕首都有名称、攻击力、价格。枪可以发射子弹(fire)，能更换弹夹(reload)；匕首可以攻击(attack)。
* */
    public Gun() {
    }

    public Gun(String name, double gonjili, double price) {
        super(name, gonjili, price);
    }

    public void fire(){
        System.out.println("发射子弹");
    }
    public void reload(){
        System.out.println("能更换弹夹");
    }
}
