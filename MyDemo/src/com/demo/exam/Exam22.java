package com.demo.exam;

import java.util.Arrays;

/**
 * @ClassName Exam22
 * @Description 【友联达】矩阵处理：先每行进行反转，然后1和0进行互换
 * @Author Yunlong
 * @Date 2019/9/10 22:01
 * @Version 1.0
 */
public class Exam22 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 0, 0}, {0, 1, 1}, {1, 1, 0}};
        reverseMatrix(matrix);
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    /**
     * 矩阵处理
     *
     * @param arr
     */
    private static void reverseMatrix(int[][] arr) {
        if (arr.length == 0 || arr == null) {
            return;
        }
        int[][] b = new int[arr.length][arr[0].length];
        b = arr.clone();
        for (int i = 0; i < b.length; i++) {
            int[] temp = reverseArray(b[i]);
            for (int j = 0; j < arr[0].length; j++) {
                if (temp[j] == 1) {
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = 1;
                }
            }
        }
    }

    /**
     * 一位数组反转
     *
     * @param a
     * @return
     */
    private static int[] reverseArray(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[a.length - i - 1];
            a[a.length - i - 1] = a[i];
            a[i] = temp;
        }
        return a;
    }
}
