package com.lanou.day04.packaging;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "张三";
        person.age = 21;
        System.out.println(person);
        person.eat("肉夹馍");
        Person person1 = new Person("李四",20);
        System.out.println(person1);
    }
}
