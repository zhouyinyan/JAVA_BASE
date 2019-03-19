package com.zhouyinyan.demo.polymorphism;

/**
 * 继承结构下的初始化顺序（递归初始化父类子对象）
 *   清理：主要要与初始化顺序的反方向清理。
 * Created by zhouyinyan on 2019/3/19.
 */
public class InitAndDestorySort {

    static class Characteristic{
        private String s;

        public Characteristic(String s) {
            this.s = s;
            System.out.println("created Characteristic " + s);
        }

        protected void dispose(){
            System.out.println("disposing Characteristic " + s);
        }
    }

    static class Description{
        private String s;

        public Description(String s) {
            this.s = s;
            System.out.println("created Description " + s);
        }

        protected void dispose(){
            System.out.println("disposing Description " + s);
        }
    }

    static class LivingCreature{
        private Characteristic p = new Characteristic("is alive");
        private Description  t = new Description("basic living creature");

        public LivingCreature() {
            System.out.println("LivingCreature()....");
        }
        protected void dispose(){
            System.out.println("LivingCreature dispose");
            p.dispose();
            t.dispose();
        }
    }

    static class Animal extends LivingCreature{
        private Characteristic p = new Characteristic("has heart");
        private Description  t = new Description("animal not vegetable");

        public Animal() {
            System.out.println("Animal()....");
        }
        protected void dispose(){
            System.out.println("Animal dispose");
            p.dispose();
            t.dispose();
            super.dispose();
        }
    }

    static class Amphibian extends Animal{
        private Characteristic p = new Characteristic("can live in water");
        private Description  t = new Description("both water and land");

        public Amphibian() {
            System.out.println("Amphibian()....");
        }
        protected void dispose(){
            System.out.println("Amphibian dispose");
            p.dispose();
            t.dispose();
            super.dispose();
        }
    }

    static class Frog extends Amphibian{
        private Characteristic p = new Characteristic("croaks");
        private Description  t = new Description("eats bugs");

        public Frog() {
            System.out.println("Frog()....");
        }
        protected void dispose(){
            System.out.println("Frog dispose");
            p.dispose();
            t.dispose();
            super.dispose();
        }
    }

    public static void main(String[] args) {
        Frog frog  = new Frog();
        System.out.println("-----------");
        frog.dispose();
    }
}
