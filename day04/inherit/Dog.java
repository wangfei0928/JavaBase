package com.lanou.day04.inherit;

public class Dog extends Animal{


    public Dog() {
    }

    public Dog(String name, Integer age) {
        super(name, age);
    }

    public void lookDoor(){
        System.out.println("狗看门");
    }
}
