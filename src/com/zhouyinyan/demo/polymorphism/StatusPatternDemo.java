package com.zhouyinyan.demo.polymorphism;

/**
 * 状态模式
 * Created by zhouyinyan on 2019/3/19.
 */
public class StatusPatternDemo {

    static class Actor{
        protected void act(){}
    }

    static class HappyActor extends Actor{
        public void act(){
            System.out.println("Happy Acctor");
        }
    }

    static class SadActor extends Actor{
        public void act(){
            System.out.println("Sad Acctor");
        }
    }

    static class Stage{
        Actor actor = new HappyActor();
        public void change(){
            actor = new SadActor();
        }
        public void perform(){
            actor.act();
        }
    }

    public static void main(String[] args) {
        Stage stage = new Stage();
        stage.perform();
        stage.change();
        stage.perform();
    }
}
