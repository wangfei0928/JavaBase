package com.lanou.day04.inherit;

public class TestAnimal {
    public static void main(String[] args) {
        Cat cat = new Cat("小猫",5);
        cat.catchMouse();
        Dog dog = new Dog("小狗",3);
        dog.lookDoor();
    }
}
