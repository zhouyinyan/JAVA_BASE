package com.zhouyinyan.demo.operator;

/**
 * int溢出
 * Created by zhouyinyan on 2019/3/18.
 */
public class BigIntegerOverFlow {
    public static void main(String[] args) {
        int i = Integer.MAX_VALUE;
        int b = i * 4;  //溢出，此时的结果不会正确
        System.out.println(b);
    }
}
