package com.demo.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @ClassName ReflectSample
 * @Description TODO
 * @Author Yunlong
 * @Date 2019/9/3 19:15
 * @Version 1.0
 */
public class ReflectSample {
    public static void main(String[] args) throws Exception {
        Class rc = Class.forName("com.demo.reflect.Robot");
        Robot r = (Robot) rc.newInstance();
        // 获取类名
        System.out.println("Class name is " + rc.getName());
        // 获取私有方法
        Method getHello = rc.getDeclaredMethod("sayHello", String.class);
        getHello.setAccessible(true);
        // 执行方法
        getHello.invoke(r, "Bob");
        // 获取公有方法
        Method sayHi = rc.getMethod("sayHi");
        // 获取成员变量
        Field name = rc.getDeclaredField("name");
        name.setAccessible(true);
        // 给变量赋值
        name.set(r, "Alice");
        sayHi.invoke(r);
    }
}
