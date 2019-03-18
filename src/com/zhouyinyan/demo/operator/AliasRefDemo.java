package com.zhouyinyan.demo.operator;

/**
 * 演示别名机制
 * Created by zhouyinyan on 2019/3/18.
 */
public class AliasRefDemo {

    float aFloat;

    /**
     * 方法参数中的别名问题
     * @param d
     */
    static void aliasMethod(AliasRefDemo d){
        d.aFloat = d.aFloat * 2;
    }

    public static void main(String[] args) {
        AliasRefDemo d1 = new AliasRefDemo();
        d1.aFloat = 3.14f;
        System.out.println(d1.aFloat);

        AliasRefDemo d2 = d1;  //此时d1 和 d2 都指向同一个对象
        System.out.println(d2.aFloat);

        d2.aFloat = 5.23f;      //通过其中一个引用修改对象字段，其它指向该对象的引用可以观察到对象字段发生变化。
        System.out.println(d2.aFloat);
        System.out.println(d1.aFloat);

        //--------------------------------
        AliasRefDemo demo = new AliasRefDemo();
        demo.aFloat = 2.8f;
        System.out.println(demo.aFloat);
        AliasRefDemo.aliasMethod(demo);     //参数传递引用，在方法内用通过引用修改对象字段，方法返回后，该对象的引用观察到对象字段发生变化
        System.out.println(demo.aFloat);

    }
}
