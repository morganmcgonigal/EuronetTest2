package com.company;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Person a = new Person("Bob Smith", "453 Quota Road, AR-72056", "Teacher");
        Person b = new Person("Joe Hender", "567 Sample Road, AR-72056", "Programmer");
        Person c = new Person("David Ron", "333 Sample1 Road, AR-72056", "Contractor");
        Person d = new Person("Bob Smith", "567 Sample Road, AR-72056", "Programmer");

        HashMap<Integer, Person> employees = new HashMap<>();

        employees.put(1, a);
        employees.put(2, b);
        employees.put(3, c);
        employees.put(4, d);

        if (a.getProfession().equals("Programmer")) {
            System.out.println("Name:   " + a.getName());
            System.out.println("Address:   " + a.getAddress());
            System.out.println("Profession:   " + a.getProfession() + "\n");
        }
        if (b.getProfession().equals("Programmer")){
            System.out.println("Name:   " + b.getName());
            System.out.println("Address:   " + b.getAddress());
            System.out.println("Profession:   " + b.getProfession() + "\n");
        }
        if (c.getProfession().equals("Programmer")){
            System.out.println("Name:   " + c.getName());
            System.out.println("Address:   " + c.getAddress());
            System.out.println("Profession:   " + c.getProfession() + "\n");
        }
        if (d.getProfession().equals("Programmer")){
            System.out.println("Name:   " + d.getName());
            System.out.println("Address:   " + d.getAddress());
            System.out.println("Profession:   " + d.getProfession() + "\n");
        }
    }
}