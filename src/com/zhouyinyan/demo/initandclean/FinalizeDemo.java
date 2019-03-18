package com.zhouyinyan.demo.initandclean;

/**
 * Created by zhouyinyan on 2019/3/18.
 */
public class FinalizeDemo {

    boolean isEmpty = true;

    public FinalizeDemo(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("invoke the finalize method");
        if(isEmpty) {
            System.out.println(isEmpty);
        }else{
            System.out.println("not empty");
        }

    }

    public static void main(String[] args) {
        new FinalizeDemo(false);
        System.gc();  //触发垃圾回收器工作
    }
}
