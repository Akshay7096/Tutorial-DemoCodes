package com.tutorial.tutorial.StreamAPIExample;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeDataBase {

    public static List<Employee> getAllEmpolyees() {

      Employee emp1 = new Employee(1,"Akshay Deshmane", "Pune", "IT");
      Employee emp2 = new Employee(2,"Kiran Shinde", "Pune", "HR");
      Employee emp3 = new Employee(3,"Sachin Tendulkar", "Mumbai","DR");
      Employee emp4 = new Employee(4,"Virat Kolhi", "Thane","MS");

      return Arrays.asList(emp1,emp2,emp3,emp4);

    }

    public static Object getObjectEmployee() {

        Object[][] Emp = {
                {"ID", "Name", "Address"},
                {1, "John Doe", "Pune"},
                {2, "Jane Smith", "Pune"},
                {3, "Mike Johnson", "Mumbai"}
        };
        return Emp;
    }

    public static Object getObjectEmployee1() {

        Object[] Emp = {

                "ID", "Name", "Address",
        };
        return Emp;
    }
}
