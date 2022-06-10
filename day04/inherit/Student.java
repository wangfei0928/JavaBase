package com.lanou.day04.inherit;

public class Student extends Person{

    public Student() {
    }

    public Student(String name, Integer age, String sex) {
        super(name, age, sex);
    }

    public void study(){
        System.out.println("好好学习天天向上");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", sex='" + getSex() + '\'' +
                '}';
    }
}
