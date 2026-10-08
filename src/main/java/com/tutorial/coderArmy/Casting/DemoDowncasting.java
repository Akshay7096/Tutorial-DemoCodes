package com.tutorial.coderArmy.Casting;

public class DemoDowncasting {

    //How to use Downcasting and Upcasting

    public static void main(String[] args) {

        //Upcasting..
        String str = "Hello";
        Object obj = str;
        System.out.println(obj);

        Box b1 = new Box(10);
        Box b2 = new Box("Hello");
        Box b3 = new Box(true);

        //downcaste
        System.out.println(b1.getObj());
        System.out.println(b2.getObj());
        System.out.println(b3.getObj());

       Integer intresult = (Integer) b1.getObj();
       String stringresult = (String) b2.getObj();
       boolean bolresult = (Boolean) b3.getObj();

        System.out.println(intresult+5);
        System.out.println(stringresult+5);
        System.out.println(bolresult);

          Integer str1 = (Integer) b2.getObj(); // direct run time  Exception coming  (ClassCastException


    }
}

class Box {
    private Object obj;
    Box (Object obj) {
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
