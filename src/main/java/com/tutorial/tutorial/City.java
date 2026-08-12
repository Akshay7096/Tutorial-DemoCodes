package com.tutorial.tutorial;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class City implements Addres{

    public void city() {
        System.out.println("City is Solapur");
    }
}
