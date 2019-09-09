package com.demo.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName Exam14
 * @Description 笔试真题
 * @Author Yunlong
 * @Date 2019/9/8 14:55
 * @Version 1.0
 */
public class Exam14 {
    public static void main(String[] args) {
        String line = "((ur)oi)";

        List<String> result = new ArrayList<>();
        List<String> subExp = new ArrayList<>(2);
        while (line.length() != 0) {
            subExp = subStr(line);
            if (subExp.size() > 0 && subExp != null) {
                StringBuffer sb = new StringBuffer(subExp.get(1));
                sb.reverse();
                result.add(sb.toString());
                line = line.replaceAll(subExp.get(0), "");
            } else {
                break;
            }
            subExp.clear();
        }
        StringBuffer value = new StringBuffer();
        for (int i = result.size() - 1; i >= 0; i--) {
            value.append(result.get(i));
        }
        System.out.println(value.toString());
    }

    private static List<String> subStr(String line) {
        if (line == null || line.length() == 0) {
            return null;
        }
        List<String> list = new ArrayList<>(2);
        String pattern = "\\(([^\\(\\)]+)\\)";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(line);
        if (m.find()) {
            list.add(m.group(0));// 存储(ur)
            list.add(m.group(1));// 存储ur
        }
        return list;
    }
}
