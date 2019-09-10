package com.demo.exam;

import java.util.*;

/**
 * @ClassName Exam20
 * @Description 【奇安信笔试题】N个人排成一队，从1-5报数，报5的出列，到尾部从头继续报数，问队尾是第多少名幸运者？
 * [参考：https://zhidao.baidu.com/question/983908138701630219.html]
 * @Author Yunlong
 * @Date 2019/9/9 20:22
 * @Version 1.0
 */
public class Exam21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine().trim());
        int result = getLastRank(N);
        System.out.println(result);
    }

    private static int getLastRank(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        boolean[] arr = new boolean[n];
        int count = 0;// 报数
        int index = 0;
        int arrLength = arr.length;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = true;
        }
        int rank = 0;// 最后一名幸运者排名
        while (arrLength > 1) {
            if (arr[index] == true) {
                count++;
                if (count == 5) {
                    rank++;
                    if (index == arr.length - 1) {
                        break;// 找到最后一名报 5 ，此时退出
                    }
                    arr[index] = false;// 出列
                    arrLength--;
                    count = 0;// 重新报数
                }
            }
            index++;
            if (index == arr.length) {
                index = 0;
            }
        }
        return rank;
    }
}
