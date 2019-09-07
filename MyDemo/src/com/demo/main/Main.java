package com.demo.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
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
        }*/

    }

    private static boolean isHuiwen(int num) {
        String str = Integer.toBinaryString(num);
        return new StringBuilder(str).reverse().toString().equals(str);
    }
}
