import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class bishi {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int getPos(int[] array, int val) {
        int left = 0;
        int right = array.length - 1;
        int mid;
        while(left <= right){
            mid = (left + right) / 2;
            if(array[mid] == val){
                while(mid > 0 && array[mid-1] == val)
                    mid--;
                return mid;
            }
            else if(array[mid] < val)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        int[] a = {1,2,2,3,3,3,4,5};
        System.out.println(getPos(a, 1));
    }
}
