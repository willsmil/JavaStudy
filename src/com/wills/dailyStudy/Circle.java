package com.wills.dailyStudy;

/**
 * Created by 18240 on 2017/9/8.
 */
public class Circle {
    private static final double PI = 3.14;
    public static int number;
    double radius;

    public Circle(double r) {
        number++;
        this.radius = r;
    }

    public double area() {
        return this.radius * this.radius * PI;
    }
    public double girth() {
        return 2 * PI * this.radius;
    }
}
