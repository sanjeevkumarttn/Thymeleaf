package com.spring.ThymeleafDemo;

public class Employee {
    private String name;
    private int id;
    private String email;
    private long salary;

    public Employee() {
    }

    public Employee(String name, int id, String email, long salary) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
