package com.tutorial.tutorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;

@Component
public class Student  {


    /*Field injection*/
    // @Autowired
    // @Qualifier("city")
    // Addres address;


    /*This is Constructor injection bellow  Best way always*/
    //    Student( @Qualifier("city") Addres addres) {
    //        this.address = addres;
    //    }

    /*Setter Injection*/
    Addres address;

    @Autowired
    @Qualifier("city")
    public void setAddres(Addres address) {
        this.address = address;
    }



        int rollNo = 101;
        String name = "Akshay";
        String emailId = "akshaydeshmane1111@gmail.com";

        void  show() {
//            System.out.println(rollNo);
//            System.out.println(name);
//            System.out.println(emailId);
//            address.city();

            //1
            List<String> list = Arrays.asList("Akansha"); //add() not support because asList is Fixed size give so

            //2
            List<String>list1 = new ArrayList<>(Arrays.asList("Akansha")); //Thats why we can use new keyword and () pass the ArrayList..
            list1.add("akshay");
//            list.add("Akshay");
//            list.add("ABC");
//            list.add("XYZ");
//            list.add("PQR");
            System.out.println("list1"+list1);

            //3
            List<Integer> list2 = new ArrayList<>();
            list2.add(1);
            list2.add(2);
            list2.add(3);
            list2.add(4);
            list2.stream().map(n -> n*2).forEach(System.out::println);
           // System.out.println("List2"+list2);


            List<Integer> list3 =   list2.stream().map(n -> n*2).collect(Collectors.toList());

            System.out.println("list3"+list3);

        }
}
