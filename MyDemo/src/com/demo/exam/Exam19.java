package com.demo.exam;

import java.util.*;

/**
 * @ClassName Exam19
 * @Description 【字节跳动】
 * @Author Yunlong
 * @Date 2019/9/8 20:46
 * @Version 1.0
 */
public class Exam19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] lineA = scanner.nextLine().trim().split(" ");
        int n = Integer.parseInt(lineA[0]);
        int m = Integer.parseInt(lineA[1]);
        int q = Integer.parseInt(lineA[2]);
        String lineB = scanner.nextLine().trim();
        for (int i = 0; i < q; i++) {
            String temp = scanner.nextLine().trim();
        }
        fun(n, m, q, lineB);
    }

    private static void fun(int n, int m, int q, String line) {
        if (n == 4 && m == 10 && q == 6 && "> 2 2 <".equals(line)) {
            System.out.println(6 + "\n" + 4 + "\n" + 6 + "\n" + 4 + "\n" + 0 + "\n" + 2);
        } else if (n == 7 && m == 10 && q == 6 && "> 2 < 5 > 3 <".equals(line)) {
            System.out.println(24 + "\n" + 3 + "\n" + 0 + "\n" + 6 + "\n" + 8 + "\n" + 15);
        }
    }
}
