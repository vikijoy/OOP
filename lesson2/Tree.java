package opp_lesson2;

import oop_lesson2.Person;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Tree {
    private static HashMap<String, Person> personList = new HashMap<>();

    public static void addPerson(String name, int age) {
        personList.put(name, new Person(name, age));
    }

    public static HashMap<String, Person> getPersonList() {return personList;}
}
