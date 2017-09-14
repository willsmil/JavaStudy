package com.wills.dailyStudy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by 18240 on 2017/9/11.
 */

class Human{
    protected String name;
    protected String sex;
    protected int age;

    Human(String name,String sex,int age){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void think(){
        System.out.println(this.name + " is thinking!");
    }
}

class Student extends Human{
    private String sno;

    Student(String name,String sex,int age,String sno){
       super(name, sex, age);
       this.sno = sno;
    }

    public void study(){
        System.out.println(super.name +  " is studying!");
    }
}

public class Sample8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings;
        while(true) {
            String str = scanner.nextLine();
            if("end".equals(str)) return;
            strings = str.split(" ");
            Student student = new Student(strings[0],strings[1],Integer.parseInt(strings[2]),strings[3]);
            student.study();
            student.think();
        }
    }
}
