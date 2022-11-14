package org.example;

public class EmployeeSalary {
    private int id;
    private double salary;
    private String name;

    public EmployeeSalary(Employee employee, Salary salary) {
        this.id = employee.getId();
        this.salary = salary.getSalary();
        this.name = employee.getName();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
