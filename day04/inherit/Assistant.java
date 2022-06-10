package com.lanou.day04.inherit;

public class Assistant extends Person{

    public Assistant() {
    }

    public Assistant(String name, Integer age, String sex) {
        super(name, age, sex);
    }
    public void manageStudent(){
        System.out.println("辅导员管理学生");
    }

    @Override
    public String toString() {
        return "Assistant{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", sex='" + getSex() + '\'' +
                '}';
    }
}
