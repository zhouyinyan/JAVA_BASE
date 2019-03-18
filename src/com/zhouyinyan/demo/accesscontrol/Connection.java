package com.zhouyinyan.demo.accesscontrol;

/**
 * Created by zhouyinyan on 2019/3/18.
 */
public class Connection {

    private int i;

    private Connection(int i) {  //阻止客户端创建
        this.i = i;
    }

    static Connection createConnection(int i){
        System.out.println("创建连接"+i);
        return new Connection(i);
    }

}
