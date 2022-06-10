package com.lanou.day04.day04homework;

public class TestHero {
    public static void main(String[] args) {
        ADHero adHero = new ADHero("张飞",800,1000,2000,400);
        adHero.physicAttack();
        System.out.println(adHero);

        APHero apHero = new APHero("诸葛亮",1200,800,900,800);
        apHero.magicAttack();
        System.out.println(apHero);
    }
}
