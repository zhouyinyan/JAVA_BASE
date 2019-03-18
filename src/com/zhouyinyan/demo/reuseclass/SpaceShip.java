package com.zhouyinyan.demo.reuseclass;

/**
 * Created by zhouyinyan on 2019/3/18.
 */
public class SpaceShip {

    private String name;
    private SpaceShipControls controls = new SpaceShipControls();

    public SpaceShip(String name) {
        this.name = name;
    }


    //代理
    void up(int velocity){
        controls.up(velocity);
    }

    void down(int velocity){
        controls.down(velocity);
    }

    void left(int velocity){
        controls.left(velocity);
    }

    void rigth(int velocity){
        controls.rigth(velocity);
    }

    public static void main(String[] args) {
        SpaceShip spaceShip = new SpaceShip("掠夺者");
        spaceShip.up(100);
        spaceShip.down(20);
        spaceShip.left(50);
        spaceShip.rigth(30);
    }

}
