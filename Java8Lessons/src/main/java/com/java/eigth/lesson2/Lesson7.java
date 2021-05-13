package com.java.eigth.lesson2;

public class Lesson7 {
    public static void main(String[] args) {
        A a = new B();
        a.say();
    }
}

interface A {
    void printMess(String mess);
    default void say () {
        printMess("Hello");
    }
}

class B implements A {
    @Override
    public void printMess(String mess) {
        System.out.println(mess);
    }
}