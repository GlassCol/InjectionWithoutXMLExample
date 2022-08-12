package org.example;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Employee {
    @Autowired
    private int id;
    @Autowired
    private String name;
    @Autowired
    private List<Phone> ph;
    @Autowired
    private Address add;

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Phone> getPh() {
        return ph;
    }

    public void setPh(List<Phone> ph) {
        this.ph = ph;
    }

    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add) {
        this.add = add;
    }
    public void Config(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "\nid - " + id +
                ",\nname - '" + name + '\'' +
                ",\nphones - " + ph +
                ",\naddress - " + add.toString() + "\n" +
                '}';
    }
}
