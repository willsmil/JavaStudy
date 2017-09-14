package com.wills.dailyStudy;

/**
 * Created by 18240 on 2017/9/14.
 */
//查看try final执行顺序
public class Final {

    static int function(int i){
        try {
            i = 1;
            return i;
        }catch (Exception e){}
        finally {
            int a=10;
            return a;
        }
    }

    public static void main(String[] args) {

        System.out.println(function(10));
    }
}
