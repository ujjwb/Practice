package org.example;

import java.util.Objects;

public class Salary {
    private double salary;
    private int id;

    public Salary(double salary, int id) {
        this.salary = salary;
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Salary salary1 = (Salary) o;
        return id == salary1.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(salary,id);
    }
}
