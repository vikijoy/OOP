package oop_lesson1;

import java.util.ArrayList;
import java.util.Scanner;
import oop_lesson1.GeoTree;
import oop_lesson1.Node;
import oop_lesson1.Person;
import oop_lesson1.Relationship;
import oop_lesson1.Research;

public class Research {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;
    ArrayList<String> resultAge = new ArrayList<>();

    public Research(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    // метод поиска связи: родитель - ребенок, жена-муж
    public ArrayList<String> spend(Person p, Relationship re) {
        for (Node t : tree) {
            if (t.p1.fullName == p.fullName && t.re == re) {
                result.add(t.p2.fullName);
            }
        }
        return result;
    }

    // метод поиска по возрасту
    public ArrayList<String> searchAge() {
        System.out.print("Введите ограничение по возрасту: ");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        System.out.println("Люди, младше: " + age + ":");

        for (Node t : tree) {

            if (t.p1.age <= age && !resultAge.contains(t.p1.fullName)) {
                resultAge.add(t.p1.fullName);
            }
        }

        //System.out.println(resultAge);

        return resultAge;
    }
}
