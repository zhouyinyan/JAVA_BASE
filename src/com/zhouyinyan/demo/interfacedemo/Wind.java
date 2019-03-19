package com.zhouyinyan.demo.interfacedemo;

/**
 * Created by zhouyinyan on 2019/3/19.
 */
public class Wind extends AbstractInstrument {

    static class Brass extends Wind{
        @Override
        public String toString() {
            return "Brass";
        }
    }

    static class Woodwind extends Wind{
        @Override
        public String toString() {
            return "Woodwind";
        }
    }
}
