package com.demo.test;

/**
 * @ClassName Test1
 * @Description TODO
 * @Author Yunlong
 * @Date 2019/9/8 17:04
 * @Version 1.0
 */
public class Test1 {
    public static void main(String[] args) {
        A a = new B();// 先输出： A Constructer  ，后输出：B constructer
        a.sayHi();// B: Hi
    }
}

class B extends A{
    public B() {
        System.out.println("B constructer");
    }
    @Override
    public void sayHi(){
        System.out.println("B: Hi");
    }
}

class A {
    public A() {
        System.out.println("A Constructer");
    }

    public void sayHi(){
        System.out.println("A: Hi");
    }
}