package com.demo.exam;

import java.util.Scanner;

/**
 * @ClassName Exam15
 * @Description 【01背包】 https://www.luogu.org/problem/P2925
 * @Author Yunlong
 * @Date 2019/9/8 16:06
 * @Version 1.0
 */
public class Exam15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().trim().split(" ");
        int c = Integer.parseInt(str[0]);
        int h = Integer.parseInt(str[1]);
        int[] v = new int[h + 1];
        int[] dp = new int[c + 1];
        for (int i = 1; i <= h; i++) {
            v[i] = Integer.parseInt(scanner.nextLine().trim());
        }
        // 01背包
        int result;
        for (int i = 1; i <= h; i++) {
            for (int j = c; j >= v[i]; j--) {
                dp[j] = Integer.max(dp[j], dp[j - v[i]] + v[i]);
            }
            if (dp[i] == c) {
                result = c;
                break;
            }
        }
        result = dp[c];

        System.out.println(result);
    }
}
