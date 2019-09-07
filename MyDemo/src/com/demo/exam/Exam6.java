package com.demo.exam;

import java.util.*;

/**
 * @ClassName Exam6
 * @Description 【小米MI笔试】一行由正数组成的字符串，移除其中K个数，使剩下的数字是所有可能中最小的
 * @Author Yunlong
 * @Date 2019/9/6 20:10
 * @Version 1.0
 */
public class Exam6 {

    public static void main(String[] args) {
        String str = "1432219";// 输出1219
        int k = 3;
        System.out.println(removeKdigits(str, k));
    }

    public static String removeKdigits(String num, int k) {
        String resullt = "";
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < num.length(); i++) {
            int number = Integer.parseInt(String.valueOf(num.charAt(i)));
            while (list.size() != 0 && k > 0 && (list.get(list.size() - 1) > number)) {
                list.remove(list.size() - 1);
                k--;
            }
            if (number != 0 || list.size() != 0) {
                list.add(number);
            }
        }
        while (list.size() != 0 && k > 0) {
            list.remove(list.size() - 1);
            k--;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 0 && resullt.length() == 0) {

            } else {
                resullt = resullt + list.get(i);
            }
        }
        if (resullt.equals(""))
            resullt = String.valueOf(0);
        return resullt;
    }

}
