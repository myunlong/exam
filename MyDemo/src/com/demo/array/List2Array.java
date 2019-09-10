package com.demo.array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName List2Array
 * @Description TODO
 * @Author Yunlong
 * @Date 2019/9/1 16:14
 * @Version 1.0
 */
public class List2Array {


    /**
     * 集合转对象数组
     */
    @Test
    public void list2Array() {
        List<Integer> list = new ArrayList<>(8);
        for (int i = 0; i < 8; i++) {
            list.add(i);
        }

        System.out.println(list);

        Integer[] array = new Integer[list.size()];
        list.toArray(array);

        System.out.println(Arrays.toString(array));
    }


    /**
     * 对象数组转集合
     */
    @Test
    public void array2List() {
        Integer[] array = new Integer[8];
        for (int i = 0; i < 8; i++) {
            array[i] = i;
        }

        List<Integer> list = Arrays.asList(array);

        System.out.println(list);
    }

}
