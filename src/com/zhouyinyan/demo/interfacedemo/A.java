package com.zhouyinyan.demo.interfacedemo;

/**
 * Created by zhouyinyan on 2019/3/19.
 */
public interface A {

    void m();

    interface B extends A {
        void m();
    }

    interface C extends A {
        void m();
    }

    interface D extends B, C {
        void m();
    }
}
