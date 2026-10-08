package com.tutorial.Java8Features;

public class Main {

    public static void main(String[] args) {
        canFly c = new canFly() {       //This is annonimous class
            @Override
            public void canFlyBird(String val) {
                System.out.println("Eagle can be Fly");
            }
        };
        c.canFlyBird("Str");
    }
}
