package com.lanou.day04.inherit;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("张三",18,"男");
        System.out.println(person);

        Student student = new Student();
        System.out.println(student);
        Student student1 = new Student("李四",19,"男");
        System.out.println(student1);

        Assistant assistant = new Assistant("张飞",20,"男");
        System.out.println(assistant);
        assistant.manageStudent();

        Teacher teacher = new Teacher("孔子",80,"男","圣人");
        System.out.println(teacher);
        teacher.teach();
        teacher.manageStudent();

        Random random = new Random();
        int num = random.nextInt(15-7+1)+7;
        System.out.println(num);

        //站在巨人的肩膀上，继承Random
        //我们之所以这么写代码，是因为 Random没有提供[min,max]随机数的方法
        //在实际开发中，很多高手，都擅长站在巨人肩膀上，去封装更多的好用的工具。
        //继承：
        //1. 子类能继承哪些东西？  ---所有的属性和方法，构造方法除外。
        //2. 子类可以重写父类的方法
        //3. 子类可以扩展父类的功能（MyRandom  扩展Random）
        MyRandom Random = new MyRandom();
        for (int i = 0; i < 10; i++) {
            int num2 = Random.nextInt(7,15);
            System.out.print(num2+" ");
        }
    }

}
