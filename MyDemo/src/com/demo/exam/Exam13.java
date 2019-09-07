package com.demo.exam;

import java.util.Scanner;

/**
 * @ClassName Exam13
 * @Description 【网易互娱】给定一个十进制的正整数X，判断在二进制下（去掉前导0）是否是回文数
 * @Author Yunlong
 * @Date 2019/9/7 21:43
 * @Version 1.0
 */
public class Exam13 {
    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine().trim());
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(scanner.nextLine().trim());
        }
        for (int j = 0; j < n; j++) {
            if (isHuiwen(nums[j])) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
         */

    }

    private static boolean isHuiwen(int num) {
        String str = Integer.toBinaryString(num);
        return new StringBuilder(str).reverse().toString().equals(str);
    }
}
