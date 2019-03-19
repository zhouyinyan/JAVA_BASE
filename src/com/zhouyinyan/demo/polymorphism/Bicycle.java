package com.zhouyinyan.demo.polymorphism;

/**
 * Created by zhouyinyan on 2019/3/18.
 */
public class Bicycle extends Cycle {
    @Override
    protected void draw() {
        System.out.println("draw a bicycle");
    }
}
