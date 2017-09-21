package com.wills.sort;

/**
 * Created by 18240 on 2017/9/20.
 */
public class FastSort {
    public static void main(String[] args) {
        int[] array = {5, 8, 1, 3, 4, 6, 7, 9, 4};
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        long start = System.nanoTime();
        fastSort(array, 0, array.length - 1);
        long end = System.nanoTime();
        System.out.println(end - start);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void fastSort(int[] a, int low, int high) {
        int temp = low;
        int sao = a[low];
        int i = low;
        int j = high;
        low++;
        for (; low <= high; ) {
            while (high > i && a[high] >= a[temp])
                high--;
            while (low < j && a[low] < a[temp])
                low++;
            if (low >= high)
                break;
            int current = a[low];
            a[low] = a[high];
            a[high] = current;
        }
        if (i != high) {
            a[i] = a[high];
            a[high] = sao;
        }
        if (high - 1 > i)
            fastSort(a, i, high - 1);
        if (high + 1 < j)
            fastSort(a, high + 1, j);
    }
}
