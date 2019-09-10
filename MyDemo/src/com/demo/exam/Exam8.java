package com.demo.exam;

/**
 * @ClassName Exam8
 * @Description 途牛笔试
 * @Author Yunlong
 * @Date 2019/9/7 11:31
 * @Version 1.0
 */
public class Exam8 {

    public static void main(String[] args) {
        Thread t = new Thread() {
            @Override
            public void run() {
                pong();
            }
        };
//        t.run();// 输出 pong ping
        t.start();// 输出 ping pong

        System.out.println("ping");
    }

    public static void pong() {
        System.out.println("pong");
    }

    /**
     * @return 2
     */
    private static int fun() {
        try {
            int i = 1 / 0;
            return 0;
        } catch (Exception e) {
            return 1;
        } finally {
            return 2;
        }
    }

}
