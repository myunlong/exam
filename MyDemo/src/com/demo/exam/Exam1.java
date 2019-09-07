package com.demo.exam;

/**
 * @ClassName Exam1
 * @Description 子串在主串中出现的次数统计, 主串有重叠
 * @Author Yunlong
 * @Date 2019/9/1 16:59
 * @Version 1.0
 */
public class Exam1 {
    public static void main(String[] args) {
        String strA = "zyzyzyz";
        String strB = "zyz";

        int count = 0;
        for (int i = 0; i <= strA.length() - strB.length(); i++) {
            if (strA.indexOf(strB, i) != -1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
