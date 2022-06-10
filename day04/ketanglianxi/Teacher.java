package com.lanou.day04.ketanglianxi;

public class Teacher {

    private String name;
    private Integer age;
    private String sex;

    private String  profession;

    public Teacher() {
    }

    public Teacher(String name, Integer age, String sex, String profession) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", profession='" + profession + '\'' +
                '}';
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void teach(){
        System.out.println("我是老师，我能授课");
    }
    public void managerStudent(){
        System.out.println("我是老师，我能管理学生！");
    }

}
