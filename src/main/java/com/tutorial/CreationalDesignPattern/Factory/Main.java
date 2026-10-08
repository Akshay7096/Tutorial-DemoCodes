package com.tutorial.CreationalDesignPattern.Factory;

import org.apache.poi.ss.formula.functions.T;

import java.util.Optional;

interface Category {

    Optional<String> print();
}

class Sports implements Category {

    @Override
    public  Optional<String>  print() {

     //   System.out.println("In side the Sports");
        String str = "In side the Sports";
        return Optional.of(str);
    }
}

class Media implements Category {

    @Override
    public  Optional<String>  print() {
        String str = "In side the SpoMediarts";
        return Optional.of(str);
    }
}

class Camera implements Category {

    @Override
    public  Optional<String>  print() {
        String str = "In side the Camera";
        return Optional.of(str);
    }
}

class CategoryFactory {

  /*  public Category CatergoryF (String str) {
        if (str == null) {
            return null;
        }
        else if (str == "Sports") {
            return new Sports();
        }
        else if (str == "Media") {
            return new Media();
        }
        else if (str == "Camera") {
            return new Camera();
        }
        return Optional.empty();

    }*/

    public Optional<Category> categoryF(String str) {


        if ("Sports".equals(str)) {
            return Optional.of(new Sports());
        } else if ("Media".equals(str)) {
            return Optional.of(new Media());
        } else if ("Camera".equals(str)) {
            return Optional.of(new Camera());
        }

        return Optional.empty();
    }
}



public class Main {
    public static void main(String[] args) {
        CategoryFactory factory = new CategoryFactory();

        Optional<Category> c = factory.categoryF("Sports");
        c.ifPresent(category -> category.print());
        c.ifPresent(System.out::println);


    }
}
