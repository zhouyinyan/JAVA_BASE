package com.zhouyinyan.demo.reuseclass;

/**
 * Created by zhouyinyan on 2019/3/18.
 */
public class Amphibian {

    String name;

    public Amphibian(String name) {
        this.name = name;
    }

    static void inspect(Amphibian amphibian){
        System.out.println(amphibian.name);
    }
}
