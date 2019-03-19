package com.zhouyinyan.demo.innerclass;

/**
 * Created by zhouyinyan on 2019/3/19.
 */
public interface U {
    void m1();
    void m2();
    void m3();

    class A {
        public U createU(){
            return new U() {
                @Override
                public void m1() {

                }

                @Override
                public void m2() {

                }

                @Override
                public void m3() {

                }
            };
        }
    }

    class B {
        int index = 0;
        U[] array = new U[10];

        public void save(U u){
            if(index < 10){
                array[index++] = u;
            }
        }

        public void clear(){
            index = 0;
            array = new U[10];
        }

        public void call(){
            for(U u : array){
                if(null != u) {
                    u.m1();
                    u.m2();
                    u.m3();
                }
            }
        }
    }

    public static void main(String[] args) {
        B b = new B();
        for(int i = 0;i<20; i++){
            A a = new A();
            b.save(a.createU());
        }
        b.call();
        b.clear();
    }
}
