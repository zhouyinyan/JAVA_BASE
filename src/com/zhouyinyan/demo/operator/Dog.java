package com.zhouyinyan.demo.operator;

/**
 * 用以说明 == 操作符作用在引用上的表现
 * Created by zhouyinyan on 2019/3/18.
 */
public class Dog {

    String name;
    String says;

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "spot";
        dog1.says = "ruff!";

        Dog dog2 = new Dog();
        dog2.name = "scruffy";
        dog2.says = "wurf!";

        Dog dog3 = dog1;
        System.out.println(dog1 == dog2); //false   比较引用是否相等
        System.out.println(dog1 == dog3); //true
        System.out.println(dog1.equals(dog2)); //false  比较对象内容是否相等，未覆盖Object.equals()方法的话，默认比较的是引用
        System.out.println(dog1.equals(dog3)); //true

    }

}
