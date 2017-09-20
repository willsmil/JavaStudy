package com.wills.regex;

/**
 * Created by 18240 on 2017/9/20.
 */
public class RemoveBlank {
    public static void main(String[] args) {
        String string = "1 2  33  22 1";
        String regex = "[\\s]+";
        String[] strings = string.split(regex);
        for(String s : strings)
            System.out.print(s + " ");
        System.out.println("\n" + string);
    }
}
