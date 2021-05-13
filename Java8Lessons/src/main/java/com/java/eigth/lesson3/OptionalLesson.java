package com.java.eigth.lesson3;

import java.util.Optional;
import java.util.stream.Stream;

public class OptionalLesson {
    public static void main(String[] args) {

        Optional<String> optional = getO();

        optional.ifPresent(System.out::println);

        Stream.of(new A("Mark"), new A("Mike")).map(A::getName).forEach(System.out::println);

    }

    static Optional<String> getO() {
        return Optional.empty();
    }
}

class A {
    private String name;

    public A(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
