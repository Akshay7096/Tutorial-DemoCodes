package com.tutorial.coderArmy.Casting;
import java.sql.Struct;
import  java.util.*;
public class ComparatorLecture {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student("Akshay",101,80));
        list.add(new Student("XVY",104,60));
        list.add(new Student("BTER",103,70));

       // Collections.sort(list, null); //null also allowed

//        Comparator <Student> c1 = new sortByName();
//        Comparator <Student> c2 = new sortByrollNo();
//        Comparator <Student> c3 = new sortBymarks();

      //  Collections.sort(list,c3);
//        Collections.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.rollNo-o2.rollNo;
//            }
//        });

        Collections.sort(list,(o1, o2) -> o1.rollNo-o2.rollNo);

        for (Student str : list) {
            System.out.println(str.name + " "+str.rollNo );
        }
    }
}

/*class sortByName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}

class sortByrollNo implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.rollNo - o2.rollNo;
    }
}

class sortBymarks implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.marks - o2.marks;
    }
}*/

class Student {

    String name;
    int rollNo;
    int marks;

    Student (String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

//    @Override
//    public int compare(Student o1, Student o2) {
//        return 0;
//    }
//
//    @Override
//    public int compareTo(Student o) {
//        return this.name.compareTo(o.name);
//    }
}


