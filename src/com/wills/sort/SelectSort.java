package com.wills.sort;

/**
 * Created by 18240 on 2017/9/20.
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] array = {5, 8, 1, 3, 4, 6, 7, 9, 4};
        int[] a = selectSort(array);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    //Select Sort(选择排序)
    public static int[] selectSort(int[] a){
        int i,j;
        int length = a.length;
        int min,temp1;
        for(i = 0; i < length; i++){
            j = i;
            min = i;
            while(j < length) {
                if (a[min] > a[j])
                    min = j;
                j++;
            }
            temp1 = a[i];
            a[i] = a[min];
            a[min] = temp1;
        }
        return a;
    }
}
