package com.demo.exam;

/**
 * @ClassName Exam5
 * @Description TODO
 * @Author Yunlong
 * @Date 2019/9/5 20:57
 * @Version 1.0
 */
public class Exam5 {
    private static long i;

    public static void main(String[] args) {
        /*
        System.out.println(getNumber(15));
        System.out.println(getNumber(4));
        System.out.println(getNumber(12));
        System.out.println(getNumber(17));
         */

        i = 1L;
        System.out.println(getNumber2(15));
        i = 1L;
        System.out.println(getNumber2(4));
        i = 1L;
        System.out.println(getNumber2(12));
        i = 1L;
        System.out.println(getNumber2(17));

    }

    /**
     * [1,2,3,4,5,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,...]
     * 每5个是一个计数周期，下一个计数周期上限值为前一个的2倍
     *
     * @param m
     * @return
     */
    private static long getNumber(long m) {
        if (m <= 0) {
            return 0;
        }
        if (m <= 5) {
            return m;
        } else {
            if (m % 5 == 0) {
                return (m / 5 - 1) * 5;
            } else {
                return m - m / 5 * 5;
            }
        }
    }

    private static long getNumber2(long m) {
        long y = m - 5 * i;
        if (y <= 0) {
            return m;
        } else {
            i = i * 2;
            return getNumber2(y);
        }
    }

}
