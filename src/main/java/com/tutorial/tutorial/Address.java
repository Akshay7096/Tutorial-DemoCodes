package com.tutorial.tutorial;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Address implements Addres {

    //String city = "Pune";

    public void city (){
        System.out.println("City is Pune");
    }

//    @Override
//    public String toString() {
//        return city;
//    }
}
