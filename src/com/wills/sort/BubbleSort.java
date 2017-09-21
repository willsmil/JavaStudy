package com.wills.sort;

/**
 * Created by 18240 on 2017/9/21.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5, 8, 1, 3, 4, 6, 7, 9, 4};
        long start = System.nanoTime();
        int[] a = bubbleSort(array);
        long end = System.nanoTime();
        System.out.println(end - start);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }


    //Bubble Sort(冒泡排序)
    public static int[] bubbleSort(int[] a) {
        int temp;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if(a[j] > a[j+1]){
                    temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }
}
