package oop_lesson1;

import oop_lesson1.GeoTree;
import oop_lesson1.Node;
import oop_lesson1.Person;
import oop_lesson1.Relationship;
import oop_lesson1.Research;
public class Node {
    public Node(Person p1, Relationship re, Person p2) {
        this.p1 = p1;
        this.re = re;
        this.p2 = p2;
    }

    Person p1;
    Relationship re;
    Person p2;

    @Override
    public String toString() {
        return String.format("<%s %s %s>", p1, re, p2);
    }

}
