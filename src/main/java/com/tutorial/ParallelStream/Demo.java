package com.tutorial.ParallelStream;
import org.springframework.scheduling.annotation.Async;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.stream().map(a -> a*2).forEach(System.out::println);

    List<Integer> collect = list.parallelStream().map(a -> a * 2).collect(Collectors.toList());
        System.out.println(collect);
    }
}
