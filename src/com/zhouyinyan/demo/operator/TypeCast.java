package com.zhouyinyan.demo.operator;

/**
 * 基础类型int和byte的互相转换
 * Created by zhouyinyan on 2019/3/18.
 */
public class TypeCast {

    public static void main(String[] args) {
        byte b = 12;
        System.out.println(b);
        int i = 2300;
        b = (byte) i;  //窄化转换，将会通过截断的方式丢失信息
        System.out.println(b);

        b = 25;
        i = b;   //扩展转换，java自动为我们做了转换，不会丢失信息
        System.out.println(i);
    }
}
