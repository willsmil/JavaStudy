package com.wills.sort;

/**
 * Created by 18240 on 2017/9/20.
 */
public class StraightInsertSort {
    public static void main(String args[]) {
        int[] array = {5, 8, 1, 3, 4, 6, 7, 9, 4};
        int[] a = straightInsertSort(array);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    //Straight Insert Sorted(直接插入排序)
    static int[] straightInsertSort(int[] a) {
        int j, compare;
        for (int i = 1; i < a.length; i++) {
            compare = a[i];
            j = i;
            while (j > 0 && compare < a[j-1]) {
                a[j] = a[j-1];
                j--;
            }
            a[j] = compare;
        }
        return a;
    }
}
