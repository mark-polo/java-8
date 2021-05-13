package com.java.eigth.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");

         Set<String> set = list.stream().filter(x -> x.equals("one")).collect(Collectors.toSet());


        String s = list.stream().map(x -> x.toUpperCase()).findAny().get();
        System.out.println(s);

        int count = Stream.of(1,2,3).reduce(0,(el, acc) -> acc + el);

        System.out.println(count);
    }
}
