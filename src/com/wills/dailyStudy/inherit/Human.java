package com.wills.dailyStudy.inherit;

/**
 * Created by 18240 on 2017/9/8.
 */
public class Human {
    private String name;
    private String sex;
    private int age;

    Human(String name,String sex,int age){
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public void think(){
        System.out.println(name + "is thinking!");
    }
}
