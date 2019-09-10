package com.demo.test;

import java.util.Arrays;

/**
 * @ClassName Test3
 * @Description 数组作为方法参数传递，方法中对其数组两种操作的差异
 * @Author Yunlong
 * @Date 2019/9/10 21:38
 * @Version 1.0
 */
public class Test3 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] a2 = {1, 2, 3, 4, 5};
        fun(a);
        fun2(a2);
    }

    private static void fun(int[] a) {
        int[] b = new int[a.length];// 此时b与a只是两个数组，对b操作时a不受影响
        for (int i = 0; i < b.length; i++) {
            b[i] = 0;
        }
        System.out.println(Arrays.toString(a));// [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(b));// [0, 0, 0, 0, 0]
    }

    private static void fun2(int[] a) {
        int[] b = a;// 没有new，此时对b进行修改，a也一并被修改
        for (int i = 0; i < b.length; i++) {
            b[i] = 0;
        }
        System.out.println(Arrays.toString(a));// [0, 0, 0, 0, 0]
        System.out.println(Arrays.toString(b));// [0, 0, 0, 0, 0]
    }
}
