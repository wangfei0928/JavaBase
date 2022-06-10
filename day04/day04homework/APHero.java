package com.lanou.day04.day04homework;

/*
 * 物理英雄和魔法英雄都有名称(name),攻击力(ap), 血量(hp), 防御力(armor), 移动速度(moveSpeed).
 * 物理英雄能进行 物理攻击(physicAttack), 魔法英雄可以进行魔法攻击(magicAttack).
* */
public class APHero extends Hero{

    public APHero() {
    }

    public APHero(String name, double ap, double hp, double armor, double moveSpeed) {
        super(name, ap, hp, armor, moveSpeed);
    }

    public String toString() {
        return "APHero{" +
                "name='" + getName() + '\'' +
                ", ap=" + getAp() +
                ", hp=" + getHp() +
                ", armor=" + getArmor() +
                ", moveSpeed=" + getMoveSpeed() +
                '}';
    }
    public void  magicAttack(){
        System.out.println("魔法英雄进行魔法攻击");
    }
}
