package com.wills.dailyStudy;

/**
 * Created by 18240 on 2017/9/8.
 */
public class JuXing {
    public static int number;
    double a;
    double b;
    public JuXing(double a, double b){
        number++;
        this.a = a;
        this.b = b;
    }
    public double area(){
        return this.a * this.b;
    }
    public double girth(){
        return 2 * (a + b);
    }
}
