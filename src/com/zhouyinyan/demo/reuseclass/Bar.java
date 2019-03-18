package com.zhouyinyan.demo.reuseclass;

/**
 * Created by zhouyinyan on 2019/3/18.
 */
public class Bar {
    Foo f1 = new Foo(1);

    Foo f2;

    Foo f3;

    Foo f4;

    {
        System.out.println("实例初始化f2");
        f2 = new Foo(2);  //实例初始化，类似于static代码块，不过是每次创建对象都会执行，在构造方法前执行
    }

    public Bar() {
        System.out.println("create bar");
        f3 = new Foo(3);
    }

    public static void main(String[] args) {
        Bar bar = new Bar();
        if(bar.f4 == null){
            bar.f4 = new Foo(4);  //惰性初始化，即真正使用的时候才初始化
        }
    }


}
