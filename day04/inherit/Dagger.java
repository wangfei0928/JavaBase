package com.lanou.day04.inherit;

/*
匕首可以攻击(attack)
*/

public class Dagger extends Weapen{

    public Dagger() {
    }

    public Dagger(String name, double gonjili, double price) {
        super(name, gonjili, price);
    }

    public void attack(){
        System.out.println("匕首可以攻击");
    }
}
