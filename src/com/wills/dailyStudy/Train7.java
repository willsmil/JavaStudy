package com.wills.dailyStudy;

/**
 * Created by 18240 on 2017/9/8.
 */
//构造园和矩形对象

public class Train7 {
    public static void main(String[] args) {
        Circle circle1 = new Circle(4.1);
        Circle circle2 = new Circle(3);
        JuXing juXing1 = new JuXing(2.1,2.2);
        JuXing juXing2 = new JuXing(2,3);
        System.out.println("the area of circle1:" + circle1.area());
        System.out.println("the area of circle2:" + circle2.area());
        System.out.println("the area of juxing1:" + juXing1.area());
        System.out.println("the area of juxing2:" + juXing2.area());
    }
}
