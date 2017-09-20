package com.wills.regex;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by 18240 on 2017/9/18.
 */
public class ClassName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String regex = "[a-z]";
        HashSet<String> hashSet = new HashSet<>();
        String[] strings = string.split(regex);
        for(String s : strings)
            hashSet.add(s);
        System.out.println(hashSet);
    }
}
