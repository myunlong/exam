package com.demo.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Vector;

/**
 * @ClassName Test2
 * @Description TODO
 * @Author Yunlong
 * @Date 2019/9/9 15:48
 * @Version 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("1", 1);
        map.put("1", 2);
        map.put("1", 3);


        System.out.println(map.size());
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        HashSet set = new HashSet();
        set.add(1);

        Vector vector = new Vector();
    }
}
