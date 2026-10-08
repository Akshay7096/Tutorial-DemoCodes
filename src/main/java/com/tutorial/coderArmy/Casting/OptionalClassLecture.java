package com.tutorial.coderArmy.Casting;

import org.apache.poi.sl.draw.geom.GuideIf;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalClassLecture {

    public static void main(String[] args) {

//        String a = null;
//
//        System.out.println(a.length()); //NullPointerException

        Optional<String> name= m1();
        System.out.println(name.orElse("Unknown"));//Direct return else part is String type
        System.out.println(name.orElseGet(()-> "Unknown"));//if name is null then..
      //  System.out.println(name.get());
        name.ifPresent(System.out::println);

    //    System.out.println(name.orElseThrow(NoSuchElementException::new));//if you got null then it will thorw exception..
       // name.ifPresentOrElse(System.out::println,()-> System.out.println("Hello"));



    }
    public static Optional<String> m1() {
        Optional<String> str = Optional.of("Hello"); //not allowed null
        Optional<String> a = Optional.empty(); //not allowed null

        Optional<String> n = Optional.ofNullable(null);//Null allowed or without also if iam not sure null or not null value


        return n;
    }
}
