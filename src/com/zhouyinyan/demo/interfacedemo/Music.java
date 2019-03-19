package com.zhouyinyan.demo.interfacedemo;

/**
 * Created by zhouyinyan on 2019/3/19.
 */
public class Music {

    void tune(Playable i){
        i.play("music");
    }

    void tuneAll(Playable[] instruments){
        for(Playable e : instruments){
            tune(e);
        }
    }

    public static void main(String[] args) {
        Playable[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Wind.Brass(),
                new Wind.Woodwind()
        };

        new Music().tuneAll(orchestra);
    }
}
