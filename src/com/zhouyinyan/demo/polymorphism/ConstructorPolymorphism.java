package com.zhouyinyan.demo.polymorphism;

/**
 * 在构造方法中调用多态的方法问题
 * Created by zhouyinyan on 2019/3/19.
 */
public class ConstructorPolymorphism {

    static class Glaph{
        protected void draw(){
            System.out.println("Glaph.draw()...");
        }

        public Glaph() {
            System.out.println("Glaph() before draw....");
            draw();
            System.out.println("Glaph() after draw....");
        }
    }

    static class RoundGlyph extends Glaph{
        private int radius = 1;

        public RoundGlyph() {
            System.out.println("RoundGlyph()... radius = " + radius);
        }

        protected void draw(){
            System.out.println("RoundGlyph.draw(), radius = " + radius);
        }
    }

    public static void main(String[] args) {
        new RoundGlyph();
    }
}
