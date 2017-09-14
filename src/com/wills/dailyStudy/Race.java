package com.wills.dailyStudy;

/**
 * Created by 18240 on 2017/9/14.
 */
//继承Thread创建线程类，打印龟兔赛跑
public class Race extends Thread {

    //构造函数
    public Race(String name) {
        this.setName(name);
    }

    //override function run()
    @Override
    public void run() {
        for (int i = 0; i < 100; i += 10) {
            if (this.getName().equals("乌龟"))
                System.out.println("\t\t乌龟跑了10米");
            else {
                System.out.println("兔子跑了10米");
            }
            try{
                Thread.sleep((long)(Math.random() * 1000));
            }catch (Exception e){}
        }
    }

    public static void main(String[] args) {
        Race rabbit = new Race("兔子");
        Race tortoise = new Race("乌龟");
        rabbit.start();
        tortoise.start();
    }
}
