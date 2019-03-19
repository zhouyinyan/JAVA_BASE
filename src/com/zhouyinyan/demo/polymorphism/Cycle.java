package com.zhouyinyan.demo.polymorphism;

import java.util.Random;

/**
 * Created by zhouyinyan on 2019/3/18.
 */
public class Cycle {
    protected void draw(){
        System.out.println("draw a cycle!");
    }

    static void draw(Cycle cycle){
        cycle.draw();
    }

    public static void main(String[] args) {
        Cycle.draw(new Bicycle()); //向上转型，动态绑定 --> 多态
        Cycle.draw(new Unicycle());
        Cycle.draw(new Tricycle());
        System.out.println("------------");

        for(int i=0;i<10; i++){
            Cycle.draw(RandmonCycleGenerator.next());
        }


    }

    static class RandmonCycleGenerator {
        private static final Random random = new Random(47);
        static Cycle next(){
            switch (random.nextInt(3)){
                case 0:
                    return new Bicycle();
                case 1:
                    return new Unicycle();
                case 2:
                    return new Tricycle();
                default:
                    return new Unicycle();
            }
        }
    }

}
