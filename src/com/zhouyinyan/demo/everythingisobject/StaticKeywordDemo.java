package com.zhouyinyan.demo.everythingisobject;

/**
 * 静态的字段，只会消耗一份存储空间，无论创建多少对象，他们共享这同一分空间。
 * 静态的方法，直接使用类名.静态方法名调用，无须实例化。
 * Created by zhouyinyan on 2019/3/18.
 */
public class StaticKeywordDemo {
    static Integer anInt = 1;

    static void staticMethod(){
        System.out.println("在静态方法中执行...");
    }

    public static void main(String[] args) {
        StaticKeywordDemo staticKeywordDemo1 = new StaticKeywordDemo();
        StaticKeywordDemo staticKeywordDemo2 = new StaticKeywordDemo();
        System.out.println(StaticKeywordDemo.anInt);
        System.out.println(staticKeywordDemo1.anInt);
        System.out.println(staticKeywordDemo2.anInt);

        System.out.println(StaticKeywordDemo.anInt == staticKeywordDemo1.anInt); // == 比较两个引用是否相等，相等表示他们指向同一个对象。

        StaticKeywordDemo.staticMethod();  //静态方法通过类名直接调用，无需实例化。

    }
}
