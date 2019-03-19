package com.zhouyinyan.demo.interfacedemo;


/**
 * Created by zhouyinyan on 2019/3/19.
 */
public abstract class BaseClass {

    public BaseClass() {
        System.out.println("BaseClass()...");
        print();  //构造方法中的多态问题
    }

    abstract void print();

    static class ExtendClass extends BaseClass{
        int i = 13;

        @Override
        void print() {
            System.out.println("i = " + i);
        }
    }

    public static void main(String[] args) {
        new ExtendClass().print();
    }
}
