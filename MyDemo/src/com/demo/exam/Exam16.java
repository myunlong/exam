package com.demo.exam;

import java.util.Scanner;

/**
 * @ClassName Exam16
 * @Description 【完全背包】 https://www.luogu.org/problem/P1853#sub
 * @Author Yunlong
 * @Date 2019/9/8 16:07
 * @Version 1.0
 */
public class Exam16 {
    /**
     * 测试输入：
     * 10000 4 2
     * 4000 400
     * 3000 250
     * <p>
     * 输出：
     * 14050
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().trim().split(" ");
        int s = Integer.parseInt(str[0]);// 总资产
        int n = Integer.parseInt(str[1]);// 年数
        int d = Integer.parseInt(str[2]);// 债券种类

        Bond[] bonds = new Bond[d + 1];
        for (int i = 1; i <= d; i++) {
            String[] line = scanner.nextLine().trim().split(" ");
            bonds[i] = new Bond(Integer.parseInt(line[0]), Integer.parseInt(line[1]));
        }

        int[] dp = new int[s * n * d];
        for (int k = 1; k <= n; k++) {// 最外层刷新本金s的值
            for (int i = 1; i <= d; i++) {// 完全背包从这里开始 (i, j)
                for (int j = bonds[i].w; j <= s; j++) {
                    dp[j] = Integer.max(dp[j], dp[j - bonds[i].w] + bonds[i].c);// 完全背包公式
                }
            }
            s += dp[s];// 本金 + 这一年的利息
        }
        System.out.println(s);// 输出总钱数
    }
}

/**
 * 债券
 */
class Bond {
    int w;// 投资额
    int c;// 年利息

    public Bond(int w, int c) {
        this.w = w;
        this.c = c;
    }
}