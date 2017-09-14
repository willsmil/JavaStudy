package com.wills.dailyStudy;

/**
 * Created by 18240 on 2017/9/14.
 */
class RaceAgain implements Runnable{
    private String name;

    public RaceAgain(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i += 10) {
            if (this.name.equals("乌龟"))
                System.out.println("\t\t乌龟跑了10米");
            else {
                System.out.println("兔子跑了10米");
            }
            try{
                Thread.sleep((long)(Math.random() * 1000));
            }catch (Exception e){}
        }
    }
}

public class Main{
    public static void main(String[] args){
        Thread rabbit = new Thread(new RaceAgain("兔子"));
        Thread tortoise = new Thread(new RaceAgain("乌龟"));
        rabbit.start();
        tortoise.start();
    }
}