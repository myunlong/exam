package com.demo.exam;

import java.util.*;

/**
 * @ClassName Exam2
 * @Description TODO
 * @Author Yunlong
 * @Date 2019/9/1 21:48
 * @Version 1.0
 */
public class Exam2 {
    private static List<Integer> result = new ArrayList<>();
    private static List<String> indexArray = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine().trim());
        List<Map<String, Integer>> customer = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().trim().split(" ");
            Map<String, Integer> temp = new HashMap<>(2);
            temp.put("a", Integer.parseInt(line[0]));
            temp.put("b", Integer.parseInt(line[1]));
            customer.add(temp);
        }

        int[] initIndex = new int[n];
        for (int i = 0; i < n; i++) {
            initIndex[i] = i;
        }
        // 得到索引的全排列
        permute(initIndex, 0);
        // 计算满意度
        for (int i = 0; i < indexArray.size(); i++) {
            // 遍历每个索引数组
            int[] index = getArray(indexArray.get(i));
            // 计算满意度
            int manyidu = 0;
            for (int j = 0; j < index.length; j++) {
                if (j == 0) {
                    customer.get(j).get("b");
                    continue;
                }
                if (j == index.length - 1) {

                    continue;
                }
                // 公式 ： 满意度 = a*(j) + b*(n-j+1)
                manyidu += customer.get(j).get("a") * j + customer.get(j).get("b") * (n - j + 1);
            }
            // 存入数组

        }

        // 找出最小的元素

    }

    /**
     * 将字符串数组转为整型数组
     *
     * @param s 字符串数组
     * @return 整型数组
     */
    private static int[] getArray(String s) {
        String[] str = s.substring(1, s.length() - 2).split(" ");
        int[] num = new int[str.length];
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(str[i]);
        }
        return num;
    }

    public static void permute(int[] array, int start) {
        if (start == array.length) {  // 输出
            // 此处得到每种排列情况
            // 索引数组 array
            indexArray.add(Arrays.toString(array));
        } else
            for (int i = start; i < array.length; ++i) {
                swap(array, start, i);  //  交换元素
                permute(array, start + 1);  //交换后，再进行全排列算法
                swap(array, start, i);  //还原成原来的数组，便于下一次的全排列
            }
    }

    private static void swap(int[] array, int s, int i) {
        int t = array[s];
        array[s] = array[i];
        array[i] = t;
    }

}
