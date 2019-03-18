package com.zhouyinyan.demo.everythingisobject;

/**
 * 用以说明类中的基本类型在对象初始化时会初始化为0值，但基本类型的局部类型不会。
 * Created by zhouyinyan on 2019/3/16.
 */
public class FieldDefaultInit {
    /**
     * 类中的字段默认会初始化为0值
     */
    int anInt;
    char aChar;

    public static void main(String[] args) {
        //----------------
        FieldDefaultInit fieldDefaultInit = new FieldDefaultInit();
        System.out.println(fieldDefaultInit.anInt);
        System.out.println((int)fieldDefaultInit.aChar);
        //----------------
//        int i;
//        System.out.println(i); //局部变量未初始化，编译器阻止对其的访问（读取）
    }
}
