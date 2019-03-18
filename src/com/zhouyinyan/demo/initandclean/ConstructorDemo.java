package com.zhouyinyan.demo.initandclean;

/**
 * java中使用构造方法进行对象的初始化，确保用户在获取对象之后，是已经正确完成初始化的对象。
 * Created by zhouyinyan on 2019/3/18.
 */
public class ConstructorDemo {

    String str;  //引用字段，在对象创建过程中默认初始化为0值，即null

    String str2 = "str2";  //直接赋值的字段，在创建对象过程中，进行赋值

    String str3;

    /**
     * 没有参数的构造方法称为默认构造器。
     * 如果没有显示定义构造方法，java会自动给我们添加默认构造方法：
     * <pre>
     *     public ConstructorDemo(){}
     * </pre>
     * 但是如果定义了构造方法，java就不会自动添加默认构造方法了。
     */
    public ConstructorDemo() {
        System.out.println(str2);   //构造方法是在对象已经创建完成之后，所有str2已经正常赋值
        System.out.println(str3);   //str3此时为默认的null
        str3 = "str3";   //通过构造方法初始化，在对象创建完后，自动调用构造方法完成赋值。
    }

    /**
     * 重载的构造方法，可以通过
     * <pre>
     *  ConstructorDemo c2 = new ConstructorDemo("str3...");
     * </pre>
     * @param str3
     */
    public ConstructorDemo(String str3) {
        this.str3 = str3;
    }

    public static void main(String[] args) {
        ConstructorDemo c = new ConstructorDemo(); //默认构造方法创建和初始化对象
        System.out.println(c.str);
        System.out.println(c.str2);
        System.out.println(c.str3);

        ConstructorDemo c2 = new ConstructorDemo("str3..."); //重载的构造方法创建和初始化对象
        System.out.println(c2.str3);

    }
}
