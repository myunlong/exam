//package com.demo.test;
//import java.util.*;
//
///**
// * @ClassName Permutation
// * @Description TODO
// * @Author Yunlong
// * @Date 2019/9/1 21:41
// * @Version 1.0
// */
//public class Permutation {
//
//    private static List<String> list = new ArrayList<>();
//
//    //start表示，从array[start]后的数据进行全排列
//    public static void permute(int[] array, int start) {
//        if (start == array.length) {  // 输出
////            System.out.println(Arrays.toString(array));
//            list.add(Arrays.toString(array));
//        } else
//            for (int i = start; i < array.length; ++i) {
//                swap(array, start, i);  //  交换元素
//                permute(array, start + 1);  //交换后，再进行全排列算法
//                swap(array, start, i);  //还原成原来的数组，便于下一次的全排列
//            }
//    }
//
//    private static void swap(int[] array, int s, int i) {
//        int t = array[s];
//        array[s] = array[i];
//        array[i] = t;
//    }
//
//    public static void main(String[] args) {
//        int[] array = new int[]{1, 2, 3, 4, 5, 6};
//        permute(array, 0);
//        for (String temp : list){
//            System.out.println(temp);
//        }
//    }
//
//}
