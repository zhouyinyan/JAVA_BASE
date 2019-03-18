package com.zhouyinyan.demo.initandclean;

/**
 * 成员
 * Created by zhouyinyan on 2019/3/18.
 */
public class ObjectCreateDemo {
    static int i;    //静态字段
    static int i2 = 2; //静态字段，定义时指定值
    static {
        System.out.println("static bock execute");
        System.out.println(i);
        System.out.println(i2);
        i = 1;     //静态块指定值
        System.out.println("------------");
    }

    int i3;
    int i4 = 4;

    public ObjectCreateDemo() {
        System.out.println("constructor execute");
        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        i3 = 3;
        System.out.println("------------");
    }

    public static void main(String[] args) {
        ObjectCreateDemo demo = new ObjectCreateDemo();

        System.out.println(demo.i3);

    }
}
