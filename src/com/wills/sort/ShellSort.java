package com.wills.sort;

/**
 * Created by 18240 on 2017/9/20.
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] array = {5, 8, 1, 3, 4, 6, 7, 9, 4};
        int[] a = shellSort(array);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    //Shell's Sort(希尔排序)
    public static int[] shellSort(int[] a){
        int i,j,temp;
        int length = a.length;
        int k = length / 2;
        while(k >= 1){

            //Straight Insert Sort for every group
            for(i = 0;i < length; i++){
                j = i;
                temp = a[i];
                while(j -k >= 0 && temp < a[j - k]){
                    a[j] = a[j - k];
                    j -= k;
                }
                a[j] = temp;
            }

            k /= 2;//change the step
        }
        return a;
    }
}
