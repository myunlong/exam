package com.demo.exam;

import java.util.Scanner;

/**
 * @ClassName Exam3
 * @Description TODO
 * @Author Yunlong
 * @Date 2019/9/5 17:04
 * @Version 1.0
 */
public class Exam3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        minNum(n);
    }

    private static void minNum(int n) {
        if (n <= 0) {
            return;
        }
        // 三种情况需要的盒数 9， 4， 9+4
        int n1 = 0, n2 = 0, n3 = 0;
        // 全用9
        if (n % 9 == 0) {
            n1 = n / 9;
        } else {
            n1 = n / 9 + 1;
        }
        // 全用4
        if (n % 4 == 0) {
            n2 = n / 4;
        } else {
            n2 = n / 4 + 1;
        }
        // 9+4
        int temp = n % 9;
        if (temp % 4 == 0) {
            n3 = n / 9 + temp / 4;
        } else {
            n3 = n / 9 + temp / 4 + 1;
        }

        int min = n1;
        if (n2 < min) {
            min = n2;
        }
        if (n3 < min) {
            min = n3;
        }
        System.out.println(min);
    }

}
