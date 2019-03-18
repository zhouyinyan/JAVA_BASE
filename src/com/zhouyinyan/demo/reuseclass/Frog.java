package com.zhouyinyan.demo.reuseclass;

/**
 * Created by zhouyinyan on 2019/3/18.
 */
public class Frog extends Amphibian{
    public Frog(String name) {
        super(name);
    }

    public static void main(String[] args) {
        Frog frog = new Frog("xsp");
        Amphibian.inspect(frog); //向上转型
    }
}
