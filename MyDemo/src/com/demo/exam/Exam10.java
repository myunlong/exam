package com.demo.exam;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @ClassName Exam10
 * @Description 途牛笔试
 * @Author Yunlong
 * @Date 2019/9/7 11:41
 * @Version 1.0
 */
public class Exam10 {
    public static void main(String[] args) {
        // TreeMap
        TreeMap<String,Integer> treeMap = new TreeMap<>();
        putValue(treeMap);
        listMap(treeMap);

        // HashMap
        HashMap<String,Integer> hashMap = new HashMap<>();
        putValue(hashMap);
        listMap(hashMap);

    }

    private static void putValue(Map<String, Integer> treeMap) {
        for (int i=0;i<10;i++){
            treeMap.put(""+i,i);
        }
    }


    private static void listMap(Map<String, Integer> treeMap) {
        for (String key:treeMap.keySet()){
            System.out.println(treeMap.get(key));
        }
    }
}
