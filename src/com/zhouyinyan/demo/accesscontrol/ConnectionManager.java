package com.zhouyinyan.demo.accesscontrol;

/**
 * Created by zhouyinyan on 2019/3/18.
 */
public class ConnectionManager {

    private static Connection[] connections;

    private static int[] usedIndex;

    static  {
        connections = new Connection[10];
        usedIndex = new int[10];
        for(int i=1; i<=10; i++){
            connections[i-1] = Connection.createConnection(i);
            usedIndex[i-1] = 0;
        }
    }

    public static Connection getConnection(){
        Connection connection = null;
        for(int i=0; i<10; i++){
            if(usedIndex[i] == 0){
                connection = connections[i];
                usedIndex[i] = 1;
                break;
            }
        }
        return connection == null ? null : connection;
    }

    public static void main(String[] args) {
        for(int i=0;i<13;i++){
            System.out.println(ConnectionManager.getConnection());
        }
    }
}
