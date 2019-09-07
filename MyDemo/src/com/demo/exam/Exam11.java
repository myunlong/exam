package com.demo.exam;

import java.util.*;

/**
 * @ClassName Exam11
 * @Description 【网易互娱】笔试
 * @Author Yunlong
 * @Date 2019/9/7 18:42
 * @Version 1.0
 */
public class Exam11 {
    /**
     * 测试输入：
     * 4
     * 0 10
     * 1 2 3 4 5 6 7 8 9 10
     * 1 15
     * 1 3 5 7 9 11 13 15 17 19 21 23 25 27 29
     * 1 7
     * 5 9 13 17 21 25 29
     * 1 0
     *
     * 输出：
     * 30
     * 15
     * 15
     * 15
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine().trim());
        int[] K = new int[n];
        int[] M = new int[n];
        List<Integer[]> days = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            Integer[] temp = new Integer[]{};
            String line1 = scanner.nextLine().trim();
            String[] str1 = line1.split(" ");
            K[i] = Integer.parseInt(str1[0]);
            M[i] = Integer.parseInt(str1[1]);
            if (M[i] == 0) {
                temp = new Integer[]{};
                days.add(temp);
                continue;
            }
            String line2 = scanner.nextLine().trim();
            String[] str2 = line2.split(" ");
            temp = new Integer[str2.length];
            for (int j = 0; j < str2.length; j++) {
                temp[j] = Integer.parseInt(str2[j]);
            }
            days.add(temp);
        }

        for (int i = 0; i < days.size(); i++) {
            System.out.println(getTimes(K[i], M[i], days.get(i)));

        }
    }

    private static int getTimes(int k, int m, Integer[] d) {
        if (k == 0) {
            return 30;
        }
        if (k == 1 && d.length == 0) {
            return 15;
        }
        Set<Integer> result = new HashSet<>();
        for (Integer tmp : d) {
            result.add(tmp);
        }
        result.add(1);
        int i = 1;
        while (i <= 30) {
            int num = i + k + 1;
            if (num <= 30) {
                result.add(num);
            }
            i = num;
        }
        List<Integer> all = new ArrayList<>(result);
        Collections.sort(all);
        return all.size();
    }

}
