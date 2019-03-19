package com.zhouyinyan.demo.interfacedemo;

/**
 * Created by zhouyinyan on 2019/3/19.
 */
public abstract class AbstractInstrument implements Instrument, Playable{
    @Override
    public void play(String s) {
        System.out.println(this + ".play().." + s);
    }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()..");
    }
}
