package com.zhouyinyan.demo.reuseclass;

/**
 * Created by zhouyinyan on 2019/3/18.
 */
public class Foo {
    int i;

    public Foo(int i) {
        this.i = i;
        System.out.println("create Foo"+i);
    }
}
