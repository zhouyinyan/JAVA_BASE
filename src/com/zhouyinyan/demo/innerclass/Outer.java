package com.zhouyinyan.demo.innerclass;

/**
 * 内部类
 * Created by zhouyinyan on 2019/3/19.
 */
public class Outer {

    private String s;

    public Outer(String s) {
        this.s = s;
        System.out.println("Outer created");
    }


    public Inner getInner(){
        return new Inner();
    }

    public void m(){
        System.out.println("Outer.s = " + s);
    }

    class Inner {
        public Inner() {
            System.out.println("inner created");
        }

        public Outer outer(){
            return Outer.this;
        }

        void displayString(){
            System.out.println("the s is " + s);
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer("hello");
        Outer.Inner inner = outer.getInner();
        inner.displayString();

        inner.outer().m();


        Inner inner1 = outer.new Inner();  //直接创建内部类，需要使用外部类对象来创建，这是因为内部类需要暗暗的连接创建它的外部类对象上。
        System.out.println(inner.outer() == inner1.outer());
    }

}
