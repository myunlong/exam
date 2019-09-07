package com.demo.array;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName SearchMinMax
 * @Description 查找数组最大、小值
 * @Author Yunlong
 * @Date 2019/9/3 20:27
 * @Version 1.0
 */
public class SearchMinMax {

    @Test
    public void test(){
        int[] a = {1,56,23,42,722,1};
        int min = searchMin(a);
        int max = searchMax(a);

        System.out.println(min);
        System.out.println(max);
    }

    public int searchMin(int[] array){
        Arrays.sort(array);
        return array[0];
    }

    public int searchMax(int[] array){
        Arrays.sort(array);
        return array[array.length-1];
    }

}
