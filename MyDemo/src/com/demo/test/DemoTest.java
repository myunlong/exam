package com.demo.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName DemoTest
 * @Description TODO
 * @Author Yunlong
 * @Date 2019/9/1 15:52
 * @Version 1.0
 */
public class DemoTest {

    @Test
    public void test7() {
        int n = 10;
        System.out.println(n & (n - 1));
        // 左乘右除
        System.out.println(n >> 1);
        System.out.println(n << 1);
        List<Integer> a = new ArrayList<>();

    }

    @Test
    public void test6() {
        int num = 8;
        System.out.println(Integer.toBinaryString(num));
        System.out.println(Integer.bitCount(num));

        int num2 = -10;
        System.out.println(Integer.toBinaryString(num2));
        System.out.println(Integer.bitCount(num2));

        Integer.toOctalString(10);
    }

    /**
     * Math.random() 生成0.0-1.0的随机数
     */
    @Test
    public void test5() {
        int start = 0;
        int end = 10;
        int pivot = (int) (start + Math.random() * (end - start + 1));
        System.out.println(pivot);
    }

    /**
     * Arrays.copyOfRange(int[] original, int from, int to)
     */
    @Test
    public void test4() {
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = Arrays.copyOfRange(a, 0, a.length / 2);
        int[] c = Arrays.copyOfRange(a, a.length / 2, a.length);
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        /*输出：
        [1, 2, 3]
        [4, 5, 6]
         */
    }

    @Test
    public void test3() {
        int a = 1, b = 1;
        System.out.println(a++);// 先使用后加1
        System.out.println(++b);// 先加1后使用
    }

    @Test
    public void test1() {
        System.out.println(5 / 2);
    }

    @Test
    public void test2() {
        // String对象传入函数进行操作后，不会改变之前的值
        String strA = "abcdef";
        String strB = new String("defgsaf");
        fun(strA);
        fun(strB);
        System.out.println(strA);
        System.out.println(strB);


        Integer a = new Integer(1);
        Integer b = new Integer(2);
        fun2(a);
        fun2(b);
        System.out.println(a);
        System.out.println(b);


        // 数组操作是改变传入函数的值
        int[] array = new int[]{1, 2, 3};
        int[] array2 = new int[]{1, 2, 3};
        fun3(array);
        fun3(array2);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));

    }

    private void fun3(int[] array2) {
        array2[2] = 999;
    }

    private Integer fun2(Integer a) {
        Integer result = a + 10;
        return result;
    }

    private String fun(String str) {
        return str + "123456";
    }

}
