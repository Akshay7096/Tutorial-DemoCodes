package com.tutorial.CreationalDesignPattern.Singleton;

//Single ton example



class Singleton3 {

    private Singleton3(){
        System.out.println("He");
    }

    private static Singleton3 instance;

    public static Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;

    }
}



class Main2 {

    public static void main(String [] args) {

        Singleton3 s1 = Singleton3.getInstance();


    }

}
