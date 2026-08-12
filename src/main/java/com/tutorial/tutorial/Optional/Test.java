package com.tutorial.tutorial.Optional;

import java.util.Optional;

public class Test {




    public static void main(String[] args) {

        Optional<String> str = optionalFun();

        Optional<String> up =  str.map(n -> n.toUpperCase());
        up.ifPresent(System.out::println);

    }

    private static Optional<String> optionalFun() {
        return Optional.ofNullable("Hello");
    }
}
