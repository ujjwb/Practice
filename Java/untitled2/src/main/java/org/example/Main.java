package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

interface A{
    default void display(){
        System.out.println("Display");
    }
}

interface B{
    default void display(){
        System.out.println("Print");
    }
}

class Employee{
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class Main implements A,B{
    public void display(){
        A.super.display();

    }
    public static void main(String[] args) {

        List<Employee> list1=new ArrayList<>();
        list1.add(new Employee(1,"AB"));
        list1.add(new Employee(2,"ABC"));
        list1.add(new Employee(3,"ABCD"));
        list1.add(new Employee(3,"ABCDE"));

        Map<Integer,Employee> m=list1.stream().collect(Collectors.toMap(Employee::getId, Function.identity(),(o1,o2)->{
            if(o1.getName().compareTo(o2.getName())>0){
                return o1;
            }
            else{
                return o2;
            }
        }));


        System.out.println(m);
    }
}