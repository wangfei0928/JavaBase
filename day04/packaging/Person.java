package com.lanou.day04.packaging;

/*
* 如果一个方法 只是类内部使用，不想再外界使用。这样的方法可以定义成私有方法。
* 一般来说  某一个功能的 中间计算过程不需要对外公开，所以说可以定义成私有方法。
* 如果 属性没有指定访问修饰符。那么属性默认的可见度是包级。
* 可见度决定了对象是否可以使用 点语法  访问属性 或者方法。
* 可见度一共有4种、修饰符 共3个  public  protected  private 缺省
* 一旦  属性或者方法定义成 private   那么 属性或者方法 只能在类的内部 使用。外部是不可以通过 对象.属性  或者 对象.方法  进行访问的
* 在实际开发过程中， 所有的属性都会定义成  private
* private  相当于 禁用了 点语法
*
* setter,getter 封装了属性的访问     功能性的方法（分数的求和，乘积等）封装了功能细节。
* 类封装了 属性和方法
*
* 实际开发中。定义一个类的时候。 属性定义成private， 提供getter/setter方法， 提供无参构造方法和有参构造方法，提供toString方法，提供功能性方法
* 访问修饰符 我们只会用到 priavte和public。属性用private修饰，方法用public修饰(不想公开的方法用private修饰)。
* */
public class Person {
    String name;
    Integer age;

    //构造方法: 是一个特殊的方法
    //特点:
    //1. 方法名和类名相同
    //2 . 方法没有返回值。 而且不能写void
    //3. 构造方法不能独立使用，只能在创建对象的时候调用,即紧跟着new对象的时候使用。
    //4. 如果我们没有编写构造方法，系统将会为我们默认提供一个无参构造方法。 一旦我们提供了任何一个构造方法，系统将不再提供默认的无参构造。
    //5. 构造方法可以重载。方法重载：方法名相同，参数个数或者参数类型不同,这样的方法成为方法重载
    //6. 构造方法的作用，给属性附上初始值。
    //7. 通常，我们会给类提供一个无参构造方法和一个有参构造方法。

    public Person(){}
    public Person(String name,Integer age){
        this.name = name;
        this.setAge(age);
    }

    public void eat(String food){
        System.out.println("吃饭" + food);
    }
    public void sleep(){
        System.out.println("睡觉");
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
        if (age <= 0){
            age =18;
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
