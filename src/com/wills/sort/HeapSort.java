package com.wills.sort;

/**
 * Created by 18240 on 2017/9/21.
 */
public class HeapSort {
    public static void main(String[] args) {
        int[] array = {5, 8, 1, 3, 4, 6, 7, 9, 4};
        long start = System.nanoTime();
        int[] a = heapSort(array);
        long end = System.nanoTime();
        System.out.println(end - start);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    //Heap Sort(堆排序)
    public static int[] heapSort(int[] a) {
        int length = a.length;
        int temp;

        //从最后一个拥有子节点的节点开始向前遍历
        for (int i = length / 2 - 1; i >= 0; i--) {
            int j = i;

            //循环将改动的节点进行排序
            while (j <= length / 2 - 1) {
                int child = j * 2 + 1;

                //找到最大子节点
                if (child < length - 1 && a[child] < a[child + 1])
                    ++child;

                //若子节点大于父节点，交换之
                if (a[j] < a[child]) {
                    temp = a[child];
                    a[child] = a[j];
                    a[j] = temp;
                    j = child;//将被交换的子节点当成父节点继续排序
                    continue;
                }
                break;
            }
        }
        return a;
    }
}
