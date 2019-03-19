package com.zhouyinyan.demo.interfacedemo;

/**
 * 工厂模式。
 * Created by zhouyinyan on 2019/3/19.
 */
public class FactoryPatternDemo {

    interface Service{
        void m1();
        void m2();
    }

    static class Impl1 implements Service{

        Impl1() {
        }

        @Override
        public void m1() {
            System.out.println("Impl1.m1()..");
        }

        @Override
        public void m2() {
            System.out.println("Impl1.m2()..");
        }
    }

    static class Impl2 implements Service{

        Impl2() {
        }

        @Override
        public void m1() {
            System.out.println("Impl2.m1()..");
        }

        @Override
        public void m2() {
            System.out.println("Impl2.m2()..");
        }
    }

    interface ServiceFactory {
        Service getService();
    }

    static class Impl1ServiceFactory implements ServiceFactory{

        @Override
        public Service getService() {
            return new Impl1();
        }
    }

    static class Impl2ServiceFactory implements ServiceFactory{

        @Override
        public Service getService() {
            return new Impl2();
        }
    }

    static void serviceConsumer(ServiceFactory factory){
        Service service = factory.getService();
        service.m1();
        service.m2();
    }


    public static void main(String[] args) {
        serviceConsumer(new Impl1ServiceFactory());
        serviceConsumer(new Impl2ServiceFactory());
    }
}
