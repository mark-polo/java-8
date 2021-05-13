package com.java.eigth;

/*
    Lambda functions
 */


import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

interface Operational<T , I> {
    int calculate(T t, I i);
}

public class Lesson1 {
    public static void main(String[] args) {

        Operational<Integer, Integer> operational = (x, y) -> x * y;

        int result = operational.calculate(12, 34);

        System.out.println(result);

        Predicate<Integer> predicate = x -> x >= 5;

        System.out.println(predicate.test(5));

        Consumer<Integer> consumer = x -> System.out.println(x);

        consumer.accept(2);

        Function<Integer, String> function = x -> x.toString();

        System.out.println(function.apply(23));

        BinaryOperator<Integer> binaryOperator = (x , y) -> x * y;

        System.out.println(binaryOperator.apply(1, 6));
    }
}
