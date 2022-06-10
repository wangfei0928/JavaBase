package com.lanou.day04.inherit;

public class Teacher extends Person{

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Teacher() {
    }

    public Teacher(String name, Integer age, String sex, String title) {
        super(name, age, sex);
        this.title = title;
    }
    public void teach(){
        System.out.println("老师正在教课");
    }
    public void manageStudent(){
        System.out.println("老师管理学生");
    }


    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", sex='" + getSex() + '\'' +
                ", title='"+ getTitle()+ '\''+
                '}';
    }
}
