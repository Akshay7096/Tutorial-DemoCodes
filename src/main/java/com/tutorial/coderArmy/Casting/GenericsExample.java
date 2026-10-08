package com.tutorial.coderArmy.Casting;

public class GenericsExample {
    //Because of upcasting and downcasting (so manny times casting that why came generics);

    public static void main(String[] args) {

        Box1<Integer> b1 = new Box1(10);
        Box1<String> b2 = new Box1("Hello");
        Box1<Boolean> b3 = new Box1(true);

        Object intval = b1.getObj() + 10;
        Object str = b2.getObj() +10;
        Object bool = b3.getObj();

        System.out.println(intval);
        System.out.println(str);
        System.out.println(bool);

      //  String str1 = (Integer) b2.getObj(); // direct run time to compaile time comming  Error (Inconvertible type)




    }
}

 class Box1<T> {
    private T obj;
    Box1 (T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
