package com.demo.test;

import java.util.Arrays;

/**
 * @ClassName ObjectArray
 * @Description TODO
 * @Author Yunlong
 * @Date 2019/9/8 16:25
 * @Version 1.0
 */
public class ObjectArray {
    public static void main(String[] args) {
        Person[] person = new Person[5];
        for (int i = 0; i < person.length; i++) {
            person[i] = new Person(i+3);
        }
        System.out.println(Arrays.toString(person));
    }
}

class Person {
    int age;

    public Person(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }

}
