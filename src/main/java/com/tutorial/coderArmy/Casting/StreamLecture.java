package com.tutorial.coderArmy.Casting;

import org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamLecture {

    public static void main(String[] args) {

        //Stream
        //  Stream is a tool for processing a Sequence of data through a chains of operations.

        //examples of Stream

        List<Employees> empList = Arrays.asList(
                new Employees(1, "Akshay ", "IT"),
                new Employees(2, "Akshada", "HR"),
                new Employees(3, "Akshata", "BA"),
                new Employees(4, "Akshaya", "IT")
        );

        empList.stream().filter(e -> e.getDepartment() == "IT").map(e -> e.getEmpName()).sorted().forEach(System.out::print);
    }
}

class Employees {

    int EmpId;
    String EmpName;
    String Department;

    Employees( int EmpId, String EmpName, String Department) {
        this.EmpId = EmpId;
        this.EmpName = EmpName;
        this.Department = Department;
    }

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    @Override
    public java.lang.String toString() {
        return super.toString();
    }
}
