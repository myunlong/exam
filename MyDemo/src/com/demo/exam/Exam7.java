package com.demo.exam;

import java.util.*;

/**
 * @ClassName Exam7
 * @Description TODO
 * @Author Yunlong
 * @Date 2019/9/6 20:58
 * @Version 1.0
 */
public class Exam7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine().trim());
        int[] prices = new int[N];
        for (int i = 0; i < N; i++) {
            prices[i] = Integer.parseInt(scanner.nextLine().trim());
        }
        int budget = Integer.parseInt(scanner.nextLine().trim());

        int result = fun1(prices, budget);
        int result2 = fun2(prices, budget);

        System.out.println(result);
        System.out.println(result2);
    }

    private static int fun1(int[] prices, int budget) {
        Arrays.sort(prices);
        int costMoney = 0;
        int count = 0;
        for (Integer p : prices) {
            if (costMoney < budget) {
                costMoney += p;
                count++;

                if (costMoney > budget) {
                    costMoney -= p;
                    break;
                }
            }
        }
        return count;
    }

    private static int fun2(int[] prices, int budget) {
        int[] dp = new int[budget + 1];
        dp[0] = 0;
        for (int i = 1; i <= budget; i++) {
            dp[i] = Integer.MAX_VALUE - 1;
        }
        for (int i = 1; i <= budget; i++) {
            for (int j = 0; j < prices.length; j++) {
                if (i >= prices[j]) {
                    dp[i] = Math.min(dp[i - prices[j]] + 1, dp[i]);
                }
            }
        }
        if (dp[budget] == Integer.MAX_VALUE - 1) {
            return -1;
        } else {
            return dp[budget];
        }
    }

}
