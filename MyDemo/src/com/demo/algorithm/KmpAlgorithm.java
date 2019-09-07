package com.demo.algorithm;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName KmpAlgorithm
 * @Description Kmp子串搜索匹配
 * @Author Yunlong
 * @Date 2019/9/1 15:53
 * @Version 1.0
 * @Reference https://www.cnblogs.com/ZuoAndFutureGirl/p/9028287.html
 */
public class KmpAlgorithm {

    @Test
    public void fun() {
        String s = "BBC ABCDAB ABCDABCDABDE";
        String p = "ABCDABD";
        int index = KmpSearch(s, p);
        System.out.println(index);
    }

    public int KmpSearch(String s, String p) {
        int[] next = getNext(p);
        int i = 0;
        int j = 0;
        int sLen = s.length();
        int pLen = p.length();
        while (i < sLen && j < pLen) {
            // 1.如果 j=-1 ，或者当前字符匹配成功（即 S[i]==P[j]），都令 i++, j++
            if (j == -1 || s.charAt(i) == p.charAt(j)) {
                i++;
                j++;
            } else {
                // 2.如果j!=-1, 且当前字符匹配失败（即S[i]!=P[j]）, 则令i不变，j=next[j]
                // next[j]即为j所对应的next值
                j = next[j];
            }
        }
        if (j == pLen) {
            return i - j;
        } else {
            return -1;
        }

    }

    public int[] getNext(String p) {
        int pLen = p.length();
        int[] next = new int[pLen];
        next[0] = -1;
        int k = -1;
        int j = 0;
        while (j < pLen - 1) {
            // p[k]表示前缀，p[j]表示后缀
            if (k == -1 || p.charAt(j) == p.charAt(k)) {
                k++;
                j++;
                if (p.charAt(j) != p.charAt(k)){
                    next[j] = k;
                }else{
                    // 因为不能出现p[j] = p[ next[j] ]，所以当出现时需要继续递归，k = next[k] = next[next[k]]
                    next[j] = next[k];
                }
            } else {
                k = next[k];
            }
        }
        System.out.println("next数组：" + Arrays.toString(next));
        return next;
    }

}
