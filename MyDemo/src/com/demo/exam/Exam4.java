package com.demo.exam;

import java.util.*;

/**
 * @ClassName Exam4
 * @Description CVTE笔试2：找出两个班中第二名的分数
 * @Author Yunlong
 * @Date 2019/9/5 20:41
 * @Version 1.0
 */
public class Exam4 {
    public static void main(String[] args) {

        /*
        List<Integer> s1 = Arrays.asList(70,20,10,80,90,100);
        List<Integer> s2 = Arrays.asList(10,20,30,100,90);
        */

        /*
        List<Integer> s1 = Arrays.asList(70,70);
        List<Integer> s2 = Arrays.asList(70,70,70,70);
        */

        List<Integer> s1 = Arrays.asList(100, 55, 33, 20, 83, 94);
        List<Integer> s2 = Arrays.asList(100, 70, 90, 10);

        System.out.println(findSecondScore(s1, s2));

    }

    private static int findSecondScore(List<Integer> classOneScore, List<Integer> classTwoScore) {
        Set<Integer> all = new HashSet<>();
        for (Integer score : classOneScore) {
            all.add(score);
        }
        for (Integer score : classTwoScore) {
            all.add(score);
        }
        List<Integer> result = null;
        if (all != null) {
            result = new ArrayList<>(all);
        }
        Collections.sort(result);
        if (result.size() <= 1) {
            return -1;
        } else {
            return result.get(result.size() - 2);
        }
    }
}
