package com.lanou.day04.day04homework;

public class Hero {

    /*
    * 需求：通过继承设计物理英雄类(ADHero)和魔法英雄类(APHero).
    * 物理英雄和魔法英雄都有名称(name),攻击力(ap), 血量(hp), 防御力(armor), 移动速度(moveSpeed).
    * 物理英雄能进行 物理攻击(physicAttack), 魔法英雄可以进行魔法攻击(magicAttack).
    * */

    private String name;
    private double ap;
    private double hp;
    private double armor;
    private double moveSpeed;

    public Hero() {}

    public Hero(String name, double ap, double hp, double armor, double moveSpeed) {
        this.name = name;
        this.ap = ap;
        this.hp = hp;
        this.armor = armor;
        this.moveSpeed = moveSpeed;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", ap=" + ap +
                ", hp=" + hp +
                ", armor=" + armor +
                ", moveSpeed=" + moveSpeed +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAp() {
        return ap;
    }

    public void setAp(double ap) {
        this.ap = ap;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getArmor() {
        return armor;
    }

    public void setArmor(double armor) {
        this.armor = armor;
    }

    public double getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(double moveSpeed) {
        this.moveSpeed = moveSpeed;
    }
}
