package com.demo.exam;

/**
 * @ClassName Exam9
 * @Description 途牛笔试
 * @Author Yunlong
 * @Date 2019/9/7 11:38
 * @Version 1.0
 */
public class Exam9 {

    /**
     * 输出 123  456
     * @param args
     */
    public static void main(String[] args) {
        Thread t = new Thread(){
            @Override
            public void run() {
                fun();
            }
        };
        t.start();

        System.out.println("456");
    }

    public static synchronized void fun(){
        System.out.println("123");
    }

}
