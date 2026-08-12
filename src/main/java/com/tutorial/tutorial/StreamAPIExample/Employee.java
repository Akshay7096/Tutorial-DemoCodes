package com.tutorial.tutorial.StreamAPIExample;

public class Employee {

    private int Id;
    private String Name;
    private String Address;
    private String Department;

    Employee(int Id, String Name, String Address, String Department) {
        this.Id = Id;
        this.Name = Name;
        this.Address = Address;
        this.Department = Department;
    }

    int getId() {
        return this.Id;
    }
    String getName() {
        return this.Name;
    }
    String getAddress() {
        return this.Address;
    }
    String getDepartment() {
        return this.Department;
    }


    void SetId (int Id, String Name, String Address) {
        this.Id = Id;
        this.Name = Name;
        this.Address = Address;
    }

    void SetName (String Name) {
        this.Name = Name;
    }

    void SetAddress (String Address) {
        this.Address = Address;
    }

    void setDepartment (String Department) {
        this.Department = Department;
    }










}
