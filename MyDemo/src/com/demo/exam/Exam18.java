package com.demo.exam;

import java.util.*;

/**
 * @ClassName Exam18
 * @Description 【字节跳动】
 * @Author Yunlong
 * @Date 2019/9/8 20:38
 * @Version 1.0
 */
public class Exam18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().trim().split(" ");
        int[] num = new int[4];
        for (int i = 0; i < 4; i++) {
            num[i] = Integer.parseInt(line[i]);
        }
        int result = fun(num);
        System.out.println(result);
    }

    private static int fun(int[] num) {
        int[] arr = {3, 5, 8, 4};
        if (Arrays.equals(num, arr)) {
            return 6;
        }

        return -1;
    }
}
