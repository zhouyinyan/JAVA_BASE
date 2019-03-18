package com.zhouyinyan.demo.reuseclass;

/**
 * Created by zhouyinyan on 2019/3/18.
 */
public class SubClass extends ParentClass {
    public SubClass() {
        super("yes");
        System.out.println("SubClass created!");
    }

    public static void main(String[] args) {
        new SubClass(); //创建子类对象时，先创建其父类对象，然后创建子类对象
    }
}
