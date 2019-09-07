package com.demo.algorithm;

import org.junit.Test;

import java.util.Arrays;

/**
 * @ClassName SortAlgorithm
 * @Description 十大经典排序算法 https://www.cnblogs.com/guoyaohua/p/8600214.html
 * @Author Yunlong
 * @Date 2019/9/3 9:46
 * @Version 1.0
 */
public class SortAlgorithm {
    @Test
    public void test() {
        int[] array = new int[]{1, 9, 3, 7, 6, 4, 22, 8};
        System.out.println(Arrays.toString(array));
//        bubbleSort(array);
//        selectionSort(array);
//        insertionSort(array);
//        shellSort(array);
      /*  int[] result = mergeSort(array);
        System.out.println(Arrays.toString(result));*/

//        System.out.println(Arrays.toString(array));
    }

    /**
     * 冒泡排序
     *
     * @param array
     * @return
     */
    public int[] bubbleSort(int[] array) {
        if (array.length == 0) {
            return array;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j + 1] < array[j]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    /**
     * 选择排序
     *
     * @param array
     * @return
     */
    public int[] selectionSort(int[] array) {
        if (array.length == 0) {
            return array;
        }
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }

    /**
     * 插入排序
     *
     * @param array
     * @return
     */
    public int[] insertionSort(int[] array) {
        if (array.length == 0) {
            return array;
        }
        for (int i = 0; i < array.length - 1; i++) {
            int current = array[i + 1];
            int preIndex = i;
            while (preIndex >= 0 && current < array[preIndex]) {
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }
            array[preIndex + 1] = current;
        }
        return array;
    }

    /**
     * 希尔排序
     *
     * @param array
     * @return
     */
    public int[] shellSort(int[] array) {
        if (array.length == 0) {
            return array;
        }
        int len = array.length;
        int temp, gap = len / 2;
        while (gap > 0) {
            for (int i = gap; i < len; i++) {
                temp = array[i];
                int preIndex = i - gap;
                while (preIndex >= 0 && array[preIndex] > temp) {
                    array[preIndex + gap] = array[preIndex];
                    preIndex -= gap;
                }
                array[preIndex + gap] = temp;
            }
            gap /= 2;
        }
        return array;
    }

    /**
     * 归并排序
     *
     * @param array
     * @return
     */
    public int[] mergeSort(int[] array) {
        if (array.length < 2) {
            return array;
        }
        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);
        return merge(mergeSort(left), mergeSort(right));
    }

    /**
     * 归并排序——将两段排序好的数组结合成一个排序数组
     *
     * @param left
     * @param right
     * @return
     */
    public int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        for (int index = 0, i = 0, j = 0; index < result.length; index++) {
            if (i >= left.length) {
                result[index] = right[j++];
            } else if (j >= right.length) {
                result[index] = left[i++];
            } else if (left[i] > right[j]) {
                result[index] = right[j++];
            } else {
                result[index] = left[i++];
            }
        }
        return result;
    }
}
