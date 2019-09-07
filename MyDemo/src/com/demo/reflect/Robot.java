package com.demo.reflect;

/**
 * @ClassName Robot
 * @Description TODO
 * @Author Yunlong
 * @Date 2019/9/3 19:13
 * @Version 1.0
 */
public class Robot {
    private String name;

    private void sayHello(String string) {
        System.out.println("Hello " + string);
    }

    public void sayHi() {
        System.out.println("Hi " + name);
    }
}
